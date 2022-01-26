package com.liang.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @ClassName Mycontroller
 * @Desc
 * @Author zhaoliang
 * @Date 2022/1/22 19:08
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/my")
public class Mycontroller {
    private final static Logger logger = LoggerFactory.getLogger(Mycontroller.class);

    @RequestMapping(value = "/getIndex", method = RequestMethod.POST)
    @ResponseBody
    public String getIndex(HttpServletRequest request){
        logger.info("开始");
        return "hello world!";
    }
}
