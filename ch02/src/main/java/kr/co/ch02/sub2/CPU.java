package kr.co.ch02.sub2;

import org.springframework.stereotype.Component;

@Component // CPU Bean 스프링 컨테이너 등록
public class CPU {

    public void show(){
        System.out.println("CPU : Intel i9");
    }

}