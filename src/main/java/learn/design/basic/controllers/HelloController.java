package learn.design.basic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/basic/")
public class HelloController{


    @RequestMapping("hello")
    public String HelloWorld()
    {
        return null;
    }


}
