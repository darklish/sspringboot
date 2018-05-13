package com.lyc.test.bootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by liyuanchao on 3/26/18.
 */
@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class BootWeb {
    public static void main(String[] args) {
        //DispatcherServlet servlet = new DispatcherServlet();
        //servlet.service();
        SpringApplication.run(BootWeb.class, args);
    }
}
