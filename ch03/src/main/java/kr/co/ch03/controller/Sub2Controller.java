package kr.co.ch03.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sub2Controller {
    @GetMapping("/sub2/register")
    public String register(){
        return "sub2/register";
    }

    @PostMapping("/sub2/register")
    public void register(@RequestParam("uid")String uid, String name){
        System.out.println("uid : " + uid);
        System.out.println("name : " + name);}

}
