package kr.co.ch02.sub2;

import org.springframework.stereotype.Component;

@Component("hynix")
public class RAM {

    public void show(){
        System.out.println("RAM : SK Hynix 32GB");
    }

}