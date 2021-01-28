package com.ls.blog.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.blog.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {
	
}
