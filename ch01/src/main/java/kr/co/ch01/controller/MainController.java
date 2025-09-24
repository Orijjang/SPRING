package kr.co.ch01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {

    @RequestMapping("/hello")
    public String hello(){
        return "/hello";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/welcome";
    }


}