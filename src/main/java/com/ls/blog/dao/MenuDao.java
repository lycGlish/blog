package com.ls.blog.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ls.blog.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuDao extends BaseMapper<MenuEntity> {

    List<MenuEntity> selectSecondMenu(Integer parentId);

    List<MenuEntity> selectFirstMenu(Integer firstMenu);

}
