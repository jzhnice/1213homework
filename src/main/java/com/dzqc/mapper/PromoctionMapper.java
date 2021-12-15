package com.dzqc.mapper;

import com.dzqc.entity.Promoction;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Promoction record);

    int insertSelective(Promoction record);

    Promoction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Promoction record);

    int updateByPrimaryKey(Promoction record);
}