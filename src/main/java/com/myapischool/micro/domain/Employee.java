package com.myapischool.micro.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by anki on 6/22/2017.
 */
@RestController
@EnableAutoConfiguration
public class Employee {

    @RequestMapping("/")
    public String home(){
        return "hello micro service students";
    }

    public static void main(String args[]){
        SpringApplication.run(Employee.class, args);
    }


}
