package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName Mycontroller
 * @Desc
 * @Author zhaoliang
 * @Date 2022/1/22 19:08
 * @Version 1.0
 **/
@Controller
public class Mycontroller {
    @RequestMapping(value = "/getMeg")
    public String getIndex(){
        return "hello world!";
    }
}
