package com.jdc.customauthorizationserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAuthorizationServer1Application {
    //for form login
    //http://localhost:8080/oauth/authorize?response_type=code&client_id=client&scope=read
    //curl -v -XPOST -u client:secret "http://localhost:8080/oauth/token?grant_type=password&username=john&password=12345&scope=read"
    public static void main(String[] args) {
        SpringApplication.run(CustomAuthorizationServer1Application.class, args);
    }

}
