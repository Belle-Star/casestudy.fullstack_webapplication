package com.belle-star.perscholas.casestudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {
    @GetMapping
    public String getLogin(Model model) {
        return "login";
    }

    @GetMapping("help")
    public String getHelp(Model model) {
        return "help";
    }

//    @GetMapping("user-profile/{id}")
//    public String getView(Model model, @PathVariable Long id) {
//        return "profile";
//    }

    @GetMapping("market-news")
    public String getMarketNews(Model model) {
        return "market-news";
    }

    @GetMapping("company-overview")
    public String getCompanyOverview(Model model) {
        return "company-overview";
    }
}