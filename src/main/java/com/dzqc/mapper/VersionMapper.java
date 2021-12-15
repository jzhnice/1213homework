package com.dzqc.mapper;

import com.dzqc.entity.Version;
import org.springframework.stereotype.Repository;

@Repository
public interface VersionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}