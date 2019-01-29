package net.cc.springcloud.ali.nacos.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhonghua.zhi
 * Created by 2019/1/29 - 1:59 PM
 * ************************************
 * Project Name spring-cloud-ali-nacos-server
 * Package Name net.cc.springcloud.ali.nacos.server.controller
 */
@RestController
public class HelloRestController {

    private Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    @RequestMapping("/hello")
    public String sayHello() {
        logger.info("Hello ....");
        return "Hello";
    }
}