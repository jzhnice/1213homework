package com.dzqc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/15 11:05
 */
@Controller
@RequestMapping("/applist")
public class applist {
    @GetMapping
    public String applist(){
        return "redirect:/page/applist.to";

    }
}
