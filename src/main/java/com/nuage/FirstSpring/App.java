package com.nuage.FirstSpring;

/**
 * Hello world!
 *
 */
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;  
  
@EnableSwagger2Doc
@SpringBootApplication  
public class App{  
  
    public static void main(String[] args) {  
        SpringApplication.run(App.class, args);  
    }  
} 

