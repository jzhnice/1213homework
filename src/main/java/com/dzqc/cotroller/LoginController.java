package com.dzqc.cotroller;

import com.dzqc.entity.bdUser;
import com.dzqc.entity.dvUser;
import com.dzqc.service.bdUserService;
import com.dzqc.service.dvUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;
/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/14 15:48
 * 登陆后台
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private bdUserService userService;
    @Autowired
    private dvUserService dvUserService;
    @PostMapping("/back")
    public String login(String usercode, String userpassword, HttpSession session, Model model) {
        bdUser user = new bdUser();
        user.setUsercode(usercode);
        List<bdUser> query = userService.query(user);
        if (query.isEmpty()) {
            model.addAttribute("error", "用户名错误");
            return "backendlogin";
        } else {
            if (userpassword.equals(query.get(0).getUserpassword())) {
                session.setAttribute("devUserSession", query.get(0));
            } else {
                model.addAttribute("error", "密码错误");
                return "backendlogin";
            }
        }
        return "redirect:/page/main.to";
    }
    @PostMapping("dologin")
    public String logintO(String usercode, String userpassword, HttpSession session, Model model){
        dvUser user = new dvUser();
        user.setDevcode(usercode);
        List<dvUser> query = dvUserService.query(user);
        if (query.isEmpty()) {
            model.addAttribute("error", "用户名错误");
            return "backendlogin";
        } else {
            if (userpassword.equals(query.get(0).getDevpassword())) {
                session.setAttribute("devUserSession", query.get(0));
            } else {
                model.addAttribute("error", "密码错误");
                return "backendlogin";
            }
        }
        return "redirect:/page/main.to";
    }
    }
