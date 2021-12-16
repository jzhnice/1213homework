package com.dzqc.mapper;

import com.dzqc.entity.Info;
import com.dzqc.entity.bdUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Info record);

    int insertSelective(Info record);
    List<Info> selectUser(Info info);

    Info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}