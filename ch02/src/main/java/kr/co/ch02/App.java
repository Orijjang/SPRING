package kr.co.ch02;


import kr.co.ch02.config.AppConfig;
import kr.co.ch02.sub1.Hello;
import kr.co.ch02.sub1.Welcome;
import kr.co.ch02.sub2.Computer;
import kr.co.ch02.sub3.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    날짜 : 2025/09/15
    이름 : 김철학
    내용 : Spring IoC/DI 실습하기
 */
public class App {

    public static void main(String[] args) {

        // 기존 객체 제어 방식
        Hello hello = new Hello();
        Welcome welcome = new Welcome();

        hello.show();
        welcome.show();

        /// ///////////////////////////////////////////////////////
        // IoC/DI(제어의 역전)
        /// ///////////////////////////////////////////////////////
        // 스프링 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 객체 가져오기
        Hello helloBean  = context.getBean(Hello.class);
        helloBean.show();

        Welcome welcomeBean = (Welcome) context.getBean("wc");
        welcomeBean.show();

        Computer com = (Computer) context.getBean("computer");
        com.show();


        /// ///////////////////////////////
        //Spring AOP 실습
        /// ///////////////////////////////
        Service service = (Service) context.getBean("service");

        service.findById();
        service.register();
        service.modify();
        service.remove();


    }
}