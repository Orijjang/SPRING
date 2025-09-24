package kr.co.ch02.config;

import kr.co.ch02.sub1.Hello;
import kr.co.ch02.sub1.Welcome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy //Spring AOP 활성화
@Configuration
@ComponentScan(basePackages = {"kr.co.ch02"})
public class AppConfig {

    // 스프링 컨테이너 빈(객체) 등록
    @Bean
    public Hello hello(){
        return new Hello();
    }

    @Bean(name = "wc")
    public Welcome welcome(){
        return new Welcome();
    }


}