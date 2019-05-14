package com.example.apackage;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AController {
    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping("/index2")
    public String index2(HttpServletRequest req) {
        System.out.println(req.getAttribute("name").toString());
        // ModelAndView mv = new ModelAndView();
        // mv.setViewName("index");
        return "index";
    }
}
