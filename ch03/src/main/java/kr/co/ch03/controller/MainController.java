
package kr.co.ch03.controller;

import kr.co.ch03.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping(value = {"/", "/index"})
    public String index(Model model){ // Model : Controller와 View 사이 데이터 공유 객체

        String str1 = "Hello World!";
        String str2 = "Hello Spring Boot!";
        String str3 = "Hello Thymeleaf!";

        // DTO 생성 초기화(생성자)
        UserDTO user1 = new UserDTO("a101", "김유신", "1999-09-09", 21);

        // DTO 생성 초기화(Setter)
        UserDTO user2 = new UserDTO();
        user2.setUid("a102");
        user2.setName("김춘추");
        user2.setBirth("1999-02-03");
        user2.setAge(20);

        // DTO 생성 초기화(Builder)
        UserDTO user3 = UserDTO.builder()
                .uid("a103")
                .name("장보고")
                .birth("1999-03-29")
                .age(31)
                .build();

        UserDTO user4 = null;

        // 리스트 생성
        List<UserDTO> dtoList = new ArrayList<>();
        dtoList.add(user1);
        dtoList.add(user2);
        dtoList.add(user3);
        dtoList.add(user4);

        model.addAttribute("str1", str1);
        model.addAttribute("str2", str2);
        model.addAttribute("str3", str3);
        model.addAttribute("user1", user1);
        model.addAttribute("user2", user2);
        model.addAttribute("user3", user3);
        model.addAttribute("user4", user4);
        model.addAttribute("dtoList", dtoList);

        return "/index";
    }




}
