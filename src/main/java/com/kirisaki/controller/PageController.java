
package com.kirisaki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PageController {
    @RequestMapping("registerPage")
    public String registerPage() {
        return "fore/register";
    }
    @RequestMapping("registerSuccessPage")
    public String registerSuccessPage() {
        return "fore/registerSuccess";
    }
    @RequestMapping("loginPage")
    public String loginPage() {
        return "fore/login";
    }

    @RequestMapping("bookTicketFail")
    public String bookTicketFail() { return "fore/bookTicketFail"; }
    @RequestMapping("bookTicketSuccess")
    public String bookTicketSuccess() { return "fore/bookTicketSuccess"; }

}

