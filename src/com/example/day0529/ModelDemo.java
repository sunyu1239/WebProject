package com.example.day0529;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelDemo {
    // 纯html是取不到model中的值的，jsp中，model中的属性是封装到request中去的，jsp通过request获取。
    @RequestMapping("hh")
    public String hh() {
        ModelMap m = new ModelMap();
        m.addAttribute("name", "xiaom");
        return "hh";
    }
}
