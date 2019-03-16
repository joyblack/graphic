package com.zhaoyi.graphic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("echart")
@Controller
public class EchartController {
    @RequestMapping("sin")
    public String sin(){
        return "/echart/sin";
    }

    @RequestMapping("cos")
    public String cos(){
        return "/echart/cos";
    }
}
