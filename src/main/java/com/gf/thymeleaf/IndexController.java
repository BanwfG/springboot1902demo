package com.gf.thymeleaf;

import com.gf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
@Controller
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("day",new Date());
        User user = new User();
        user.setUsername("白洋");
        user.setAddress("兰州");
        model.addAttribute("user",user);
        return "/index";
    }
    @RequestMapping(value = "/index1",method = RequestMethod.GET)
    public String index1(Model model){
        model.addAttribute("day",new Date());
        User user = new User();
        user.setUsername("李嘉鹏");
        user.setAddress("四川");
        model.addAttribute("user",user);
        return "/index1";
    }
}
