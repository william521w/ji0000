package com.springboot.admin.test;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by DELL on 2018/7/27.
 */
@SpringBootApplication
@EnableAdminServer
public class SpringbootAdminApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringbootAdminApplication.class,args);
    }
}
