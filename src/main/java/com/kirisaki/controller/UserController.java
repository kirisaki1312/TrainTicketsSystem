package com.kirisaki.controller;

import com.kirisaki.pojo.Stop;
import com.kirisaki.pojo.User;
import com.kirisaki.service.StopService;
import com.kirisaki.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    StopService stopService;

    @RequestMapping("forehome")
    public String home(Model model) {
        List<Stop> stops = stopService.queryAllStop();
//        System.out.println(stops);
        model.addAttribute("stops", stops);
        return "fore/home";
    }

    @RequestMapping("foreregister")
    public String register(Model model, User user) {
        String name =  user.getUser_name();
        name = HtmlUtils.htmlEscape(name);
        user.setUser_name(name);
        boolean exist = userService.isExist(name);

        if(exist){
            String m ="用户名已经被使用,不能使用";
            model.addAttribute("msg", m);

            return "fore/register";
        }
        userService.add(user);

        return "redirect:registerSuccessPage";
    }

    @RequestMapping("forelogin")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password, Model model, HttpSession session) {
        name = HtmlUtils.htmlEscape(name);
        User user = userService.get(name,password);

        if(null==user){
            model.addAttribute("msg", "账号密码错误");
            return "fore/login";
        }
        session.setAttribute("user", user);
        return "redirect:forehome";
    }

    @RequestMapping("forelogout")
    public String logout( HttpSession session) {
        session.removeAttribute("user");
        return "redirect:/forehome";
    }

    @RequestMapping("forecheckLogin")
    @ResponseBody
    public String checkLogin( HttpSession session) {
        User user = (User)session.getAttribute("user");
        if(null!=user)
            return "success";
        return "fail";
    }


}
