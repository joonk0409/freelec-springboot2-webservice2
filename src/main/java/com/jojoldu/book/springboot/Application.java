package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing  //JPA Auditing 활성화
public class Application {
    public static void main(String[] args){
        System.out.println("Application Start!!!!!");
        SpringApplication.run(Application.class,args);
    }
}
