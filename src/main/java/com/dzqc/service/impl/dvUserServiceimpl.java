package com.dzqc.service.impl;

import com.dzqc.entity.dvUser;
import com.dzqc.mapper.dvUserMapper;
import com.dzqc.service.dvUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/15 9:22
 */
@Service
@Repository
public class dvUserServiceimpl implements dvUserService  {
    @Autowired
    private dvUserMapper mapper;
    @Override
    public List<dvUser> query(dvUser dvUser) {
        System.out.println("进入dvUser中的query的方法");
        List<dvUser> dvUsers = mapper.selectUser(dvUser);
        return dvUsers;
    }

    @Override
    public Integer add(dvUser dvUser) {
        return null;
    }

    @Override
    public Integer edit(dvUser dvUser) {
        return null;
    }

    @Override
    public Integer remove(Long id) {
        return null;
    }
}
