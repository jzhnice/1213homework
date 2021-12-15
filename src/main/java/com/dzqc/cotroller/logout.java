package com.dzqc.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/15 10:43
 * 销毁session
 */
@Controller
@RequestMapping("/manager")
public class logout {
    @GetMapping("logout" )

    public String logout(HttpServletRequest request, HttpSession session){
        Enumeration<String> attributeNames = request.getSession().getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            request.getSession().removeAttribute(attributeNames.nextElement().toString());
        }
        session.invalidate();
//        session 关闭
//        session.
        return "redirect:/login/dologin";
    }

}
