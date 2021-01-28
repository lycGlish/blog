package com.ls.blog.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.blog.dao.MenuDao;
import com.ls.blog.entity.MenuEntity;
import com.ls.blog.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuDao, MenuEntity> implements MenuService {

    @Override
    public List<MenuEntity> getAllMenu() {
        return baseMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<MenuEntity> getSecondMenu(Integer parentId) {
        return baseMapper.selectSecondMenu(parentId);
    }

    @Override
    public List<MenuEntity> getFirstMenu() {
        // TODO 换成数据字典
        return baseMapper.selectFirstMenu(0);
    }
}