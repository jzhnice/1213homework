package com.dzqc.cotroller;

import com.alibaba.fastjson.JSON;
import com.dzqc.entity.Info;
import com.dzqc.entity.bdUser;
import com.dzqc.service.InfoService;
import com.dzqc.service.bdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/15 16:05
 */
@Controller
@RequestMapping("/user")
public class bdUserController {
    @Autowired
//    private bdUserService bdUserService;
    private InfoService infoService;

    @GetMapping

    public String query() {
        System.out.println("进入到Controller中的方法");
        List<Info> query = infoService.query(null);
        System.out.println("这里是Controller中的方法："+query);
        return "redirect:/page/querry.to";
    }


}


