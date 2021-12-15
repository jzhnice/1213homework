package com.dzqc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/15 10:43
 */
@Controller
@RequestMapping("/manager")
public class logout {
    @PostMapping("logout")
    public String logout(HttpSession session){
//        session 关闭
//        session.
        return "redirect:/login/dologin";
    }

}
