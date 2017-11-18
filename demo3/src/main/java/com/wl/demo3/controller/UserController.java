package com.wl.demo3.controller;

import com.wl.demo3.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public String list(){
        System.out.println("list");
        return "/user/list";
    }

    @RequestMapping("/add")
    public String add(User user){
        System.out.println("====" + user.getName() + ",生日：" + user.getBirthday());
        return "redirect:/user/list";
    }

    @RequestMapping("/add/{age}")
    public String add1(@PathVariable("age") int age){
        System.out.println("====" + age);
        return "redirect:/user/list";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public List<User> hello(){
        List<User> list = new ArrayList<User>();
        for (int i = 0; i < 10; i++){
            User user = new User();
            user.setName("名称" +  i);
            user.setBirthday(new Date());
            list.add(user);
        }
        return list;
    }

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
                true));
    }
}
