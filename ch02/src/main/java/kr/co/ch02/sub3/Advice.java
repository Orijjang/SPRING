package kr.co.ch02.sub3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice { //Advice : 관심사(부가기능)를 정의해 놓은 모듈
    
    //포인트 컷 : 핵심 기능에 삽입하는 내용이 없는 참조 메서드
    @Pointcut("execution(void kr.co.ch02.sub3.Service.register())")
    public void insert(){}

    @Pointcut("execution(void kr.co.ch02.sub3.Service.findById())")
    public void select(){}

    @Before("insert() || select()")    
    public void before() {
        System.out.println("before...");
    }
    
    @After("insert() || select()")
    public void after() {
        System.out.println("after...");
    }
    
    @Around("select()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before...");

        //핵심기능 실행
        pjp.proceed();
        
        System.out.println("around after...");
    }
    
}
