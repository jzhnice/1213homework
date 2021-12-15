package com.dzqc.mapper;

import com.dzqc.entity.Info;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}