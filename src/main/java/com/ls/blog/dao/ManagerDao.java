package com.ls.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.blog.entity.ManagerEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ManagerDao extends BaseMapper<ManagerEntity> {
	
}
