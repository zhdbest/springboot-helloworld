package com.hongmao.controller;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.security.RunAs;

/**
 * @author haodong.zhao
 * @version 1.0. Added Time:2019/11/9 10:50
 */
public class HelloControllerTest {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testController() {
        logger.trace("trace日志");
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志");
        logger.error("error日志");
    }
}
