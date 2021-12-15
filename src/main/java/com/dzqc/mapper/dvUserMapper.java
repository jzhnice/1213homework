package com.dzqc.mapper;

import com.dzqc.entity.bdUser;
import com.dzqc.entity.dvUser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface dvUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(dvUser record);

    int insertSelective(dvUser record);
    List<dvUser> selectUser(dvUser dvUser);

    dvUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(dvUser record);

    int updateByPrimaryKey(dvUser record);
}