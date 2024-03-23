package com.lifetime.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lifetime Max
 * @date 2024/03/23 0023 16:52
 * @description HelloController
 */
@Controller
public class HelloController {
    @RequestMapping("/")//请求映射路径：当浏览器请求"/"时，此方法执行
    public String index(){
        return "index";
    }
}
