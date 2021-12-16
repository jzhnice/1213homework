package com.dzqc.cotroller;

import com.dzqc.service.bdUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private bdUserService userService;
    @GetMapping("main.to")
    public String main(){
        return "backend/main";
    }
    @GetMapping("maint.to")
    public String maint(){
        return "developer/main";
    }
    @GetMapping("login.to")
    public String login(){
        return "backendlogin";
    }

    @GetMapping("querry.to")
    public String querry(){
        return "backend/applist";
    }
}
