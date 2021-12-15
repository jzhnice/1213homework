package com.dzqc.service;


import com.dzqc.entity.bdUser;

public interface bdUserService<B> extends  BaseService<bdUser>{
    bdUser queryuserById(Long id);
}
