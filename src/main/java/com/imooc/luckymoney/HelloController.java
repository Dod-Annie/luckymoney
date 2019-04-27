package com.imooc.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

//@Controller + @ResponseBody = @RestController

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private  LimitConfig  LimitConfig;
    @GetMapping({"/say/{id}"})
    public String say(@PathVariable("id") Integer id){
        return "id:" +id;
    }
}
