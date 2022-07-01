package com.gf.controller;

import com.gf.pojo.Demo;
import com.gf.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("/likeName/{name}")
    public List<Demo> likeName(@PathVariable("name") String name){
        return demoService.likeName(name);
    }

    @RequestMapping("save")
    public Demo save(){
        Demo demo = new Demo();
        demo.setName("白洋");
        demoService.save(demo);
        return demo;
    }
}
