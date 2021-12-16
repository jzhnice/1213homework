package com.dzqc.service.impl;
import com.dzqc.entity.Info;
import com.dzqc.entity.bdUser;
import com.dzqc.mapper.InfoMapper;
import com.dzqc.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/16 9:40
 */
@Repository
@Service
public class InfoServiceImpl  implements InfoService {
    @Autowired
    private InfoMapper mapper;
    @Override
    public List<Info> query(Info info) {
        System.out.println("进入到了service层中info query的方法中");
        List<Info> infos = mapper.selectUser(info);
        System.out.println(infos);
        return infos;


    }
    @Override
    public Integer add(Info info) {
        return null;
    }
    @Override
    public Integer edit(Info info) {
        return null;
    }
    @Override
    public Integer remove(Long id) {
        return null;
    }
}