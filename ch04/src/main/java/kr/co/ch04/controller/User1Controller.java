package kr.co.ch04.controller;

import kr.co.ch04.dto.User1DTO;
import kr.co.ch04.service.User1Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
public class User1Controller {

    private final User1Service service;

    @GetMapping("/user1/register")
    public String register(){
        return "/user1/register";
    }

    @PostMapping("/user1/register")
    public String register(User1DTO user1DTO){
        System.out.println(user1DTO);
        service.save(user1DTO);

        return "redirect:/user1/list";
    }

    @GetMapping("/user1/list")
    public String list(Model model){
        List<User1DTO> dtoList = service.getUsers();
        model.addAttribute("dtoList",dtoList);
        return "/user1/list";
    }

    @GetMapping("/user1/modify")
    public String modify(Model model, @RequestParam("uid") String uid){
        User1DTO user1DTO = service.getUser(uid);
        model.addAttribute(user1DTO);
        return "/user1/modify";
    }

    @PostMapping("/user1/modify")
    public String modify(User1DTO user1DTO){
        service.update(user1DTO);
        return "redirect:/user1/list";
    }

    @GetMapping("/user1/delete")
    public String delete(String uid){
        service.delete(uid);
        return "redirect:/user1/list";
    }



}