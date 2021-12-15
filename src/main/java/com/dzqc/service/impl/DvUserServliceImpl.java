package com.dzqc.service.impl;

import com.dzqc.entity.bdUser;
import com.dzqc.mapper.bdUserMapper;
import com.dzqc.service.bdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jzh
 * @version 1.0
 * @date 2021/12/7 10:20
 */

@Repository
@Service
public class DvUserServliceImpl implements bdUserService<bdUser> {

    @Autowired
    private bdUserMapper mapper;

    @Override
    public List<bdUser> query(bdUser bdUser) {
        System.out.println("进入到了query的方法中");
        List<bdUser> bdUsers = mapper.selectUser(bdUser);
        return bdUsers;
    }

    @Override
    public Integer add(bdUser bdUser) {
        return null;
    }

    @Override
    public Integer edit(bdUser bdUser) {
        return null;
    }

    @Override
    public Integer remove(Long id) {
        return null;
    }


    @Override
    public bdUser queryuserById(Long id) {
        return null;
    }
}
