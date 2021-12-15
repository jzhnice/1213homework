package com.dzqc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/14 16:32
 * 中转站
 */
@Controller
@RequestMapping("/page")
public class PageDispatcherController {
    @GetMapping("main.to")
    public String main(){
        return "backend/main";
    }
    @GetMapping("login.to")
    public String login(){
        return "backendlogin";
    }


}
