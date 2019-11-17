package com.hongmao.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/11/7 10:38
 */
@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }

    @RequestMapping("getPort")
    @ResponseBody
    public String getPort(HttpServletRequest request) {
        int port = request.getLocalPort();
        logger.trace("trace日志");
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");
        return "port: " + port;
    }

    @RequestMapping("success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好！");
        return "success";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }
}
