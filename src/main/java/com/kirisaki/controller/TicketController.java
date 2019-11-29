package com.kirisaki.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kirisaki.pojo.*;
import com.kirisaki.service.StopService;
import com.kirisaki.service.TicketService;
import com.kirisaki.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("")
public class TicketController {

    @Autowired
    TicketService ticketService;

    @Autowired
    StopService stopService;

    @RequestMapping("forequeryTicket")
    public String queryTicket(@RequestParam("date") String date, @RequestParam("start_city") String start_city, @RequestParam("end_city") String end_city, Model model, Page page){

        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<QueryTicketAndSeat> qt = ticketService.queryTicketList(date, start_city, end_city);
        /**
         * 这个地方真的可以好好讲一讲，这个Pageinfo.getTotal()必须要是在执行完第一条能拿到总数的SQL语句后面一行
         * 否则会拿错，由于我的bought方法里面写了多句sql，导致total拿错；
         * 当前的项目的解决办法：将page对象传进service方法，并在第一条能拿到总数的SQL语句后面一行执行Pageinfo.getTotal()
         * 更好地解决方案：分页时的service中、甚至所有的service中避免使用多条SQL，尽量一句SQL把要的东西都查到，一句不行的话就调存储过程
         */
//        int total = (int) new PageInfo<>(qt).getTotal();
//        page.setTotal(total);

        List<Stop> stops = stopService.queryAllStop();
        model.addAttribute("qt", qt);
        model.addAttribute("page", page);
        model.addAttribute("stops", stops);

        return "fore/listTicket";
    }

    @RequestMapping("foreremainSeat")
    public String queryRemainSeat(){
        String train_id = "3";
        String date = "2019-06-18";
        String start_index = "1";
        String end_index = "10";
        List<RemainSeat> result = ticketService.queryRemainSeat(Integer.parseInt(train_id), date, Integer.parseInt(start_index), Integer.parseInt(end_index));
        if(result.size() == 0){
            System.out.println("无结果");
        }else{
            for (RemainSeat temp : result) {
                System.out.println(temp);
            }
        }
        return "redirect:forehome";
    }

    @RequestMapping("foreremainSeatDetail")
    public String queryRemainSeatDetail(){
        String train_id = "3";
        String date = "2019-06-18";
        String start_index = "1";
        String end_index = "10";
        List<RemainSeatDetail> result = ticketService.queryRemainSeatDetail(Integer.parseInt(train_id), date, Integer.parseInt(start_index), Integer.parseInt(end_index));
        if(result.size() == 0){
            System.out.println("无结果");
        }else{
            for (RemainSeatDetail temp : result) {
                System.out.println(temp);
            }
        }
        return "redirect:forehome";
    }

    @RequestMapping("forebookTickt")
    public String bookTickt(Integer train_id, String train_name, Integer start_index, Integer end_index, String start_time, String end_time, String mileage, Integer seat_type_choose, HttpSession session){
        User user = (User) session.getAttribute("user");
        Integer user_id = user.getUser_id();

        Integer affectRow = ticketService.bookTicket(user_id, train_id, train_name, start_index, end_index, start_time, end_time, mileage, seat_type_choose);
        if(affectRow < 1){
            String msg = "手速太慢了,票已经被抢光啦！";//这句话应该在哪个控制器里处理呢
            System.out.println("订票失败");
            return "redirect:bookTicketFail";
        }else{
            System.out.println("订票成功");
            return "redirect:bookTicketSuccess";
        }
    }

    @RequestMapping("forebought")
    public String bought(HttpSession session, Model model, Page page){
//        System.out.println(page);
        PageHelper.offsetPage(page.getStart(),page.getCount());//这一句一定要放在查询语句前面

        User user = (User) session.getAttribute("user");
        Integer user_id = user.getUser_id();
        List<TicketBought> bought = ticketService.bought(user_id, page);
        /**
         * 这个地方真的可以好好讲一讲，这个Pageinfo.getTotal()必须要是在执行完第一条能拿到总数的SQL语句后面一行
         * 否则会拿错，由于我的bought方法里面写了多句sql，导致total拿错；
         * 当前的项目的解决办法：将page对象传进service方法，并在第一条能拿到总数的SQL语句后面一行执行Pageinfo.getTotal()
         * 更好地解决方案：分页时的service中、甚至所有的service中避免使用多条SQL，尽量一句SQL把要的东西都查到，一句不行的话就调存储过程
         */
//        int total = (int) new PageInfo<>(bought).getTotal();
//        page.setTotal(total);

//        System.out.println(page);

        model.addAttribute("bought",bought);
        model.addAttribute("page",page);
        return "fore/cart";
    }

    @RequestMapping("forecancelTicket")
    public String cancelTickt(Integer ticket_id){

        Integer affectRow = ticketService.cancelTicket(ticket_id);
        if(affectRow<1){
            System.out.println("退订失败");
        }else{
            System.out.println("退订成功");
        }

        return "redirect:forebought";
    }
}
