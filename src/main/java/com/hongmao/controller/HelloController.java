package com.hongmao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/11/7 10:38
 */
@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("getPort")
    @ResponseBody
    public String getPort(HttpServletRequest request) {
        return "port: " + request.getLocalPort();
    }
}
