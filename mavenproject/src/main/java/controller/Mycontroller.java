package controller;

import org.apache.logging.log4j.core.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 * @ClassName Mycontroller
 * @Desc
 * @Author zhaoliang
 * @Date 2022/1/22 19:08
 * @Version 1.0
 **/
@Controller
public class Mycontroller {
    Logger logger = (Logger) LoggerFactory.getLogger(Mycontroller.class);
    @RequestMapping(value = "/getIndex")
    @ResponseBody
    public String getIndex(HttpServletRequest request){
        logger.info("12345");
        return "hello world!";
    }
}
