package com.zhaoyi.graphic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("kmean")
@Controller
public class KMeanController {
    @RequestMapping("index")
    public String index(){
        return "/kmean/index";
    }

}
