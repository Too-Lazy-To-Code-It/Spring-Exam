package com.example.rafrafadam.Configuration;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ExamAspect {
    //Show excution time of method
    public Object profile(ProceedingJoinPoint pjp)throws Throwable{
        long start=System.currentTimeMillis();
        Object obj=pjp.proceed();
        long elapsedTime=System.currentTimeMillis()-start;
        log.info("method execution time : "+ elapsedTime+" ms.");
        return obj;
    }
    //Show name of method
    //After excution any Method in Services
    @After("execution(* com.example.rafrafadam.Services.*.addDonation*(..))")
    public void logMthodEntry(JoinPoint joinPoint)
    {

        //log.info("in method : "+ joinPoint.getSignature().getName() );
        log.info("MERCI POUR CE DON");

    }

}
