package com.example.day0517;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DispatcherDemo {
    @RequestMapping("mv")
    public ModelAndView ss() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;

    }
}
