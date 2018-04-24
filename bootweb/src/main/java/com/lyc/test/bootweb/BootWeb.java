package com.lyc.test.bootweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by liyuanchao on 3/26/18.
 */
@SpringBootApplication
public class BootWeb {
    public static void main(String[] args) {
        DispatcherServlet servlet = new DispatcherServlet();
        //servlet.service();
        SpringApplication.run(BootWeb.class, args);
    }
}
