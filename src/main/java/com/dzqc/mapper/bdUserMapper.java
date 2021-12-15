package com.dzqc.mapper;

import com.dzqc.entity.bdUser;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface bdUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(bdUser record);

    int insertSelective(bdUser record);

    bdUser selectByPrimaryKey(Long id);
    List<bdUser> selectUser(bdUser bdUser);

    int updateByPrimaryKeySelective(bdUser record);

    int updateByPrimaryKey(bdUser record);

}