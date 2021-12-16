package com.dzqc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/15 10:43
 * 销毁session
 * 以失败，暂不处理
 */
@Controller
@RequestMapping(value = "/manager" ,method = RequestMethod.GET)
public class logout {
    public String logout(HttpServletRequest request, HttpSession session){
        session.invalidate();
        return "redirect:/login/dologin";
    }

}
