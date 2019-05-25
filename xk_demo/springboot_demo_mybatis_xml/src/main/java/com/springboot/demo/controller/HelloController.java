package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/14 0014.
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello( String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age","25");
        model.addAttribute("sex","man");
        model.addAttribute("birth",new Date());
        return "helloJsp";
    }


    @RequestMapping("/json")
    @ResponseBody
    public Map<String,Object> json(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Flyat");
        map.put("age","25");
        map.put("sex","man");
        return map;
    }

}
