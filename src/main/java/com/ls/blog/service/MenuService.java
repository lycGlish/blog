package com.ls.blog.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.ls.blog.entity.MenuEntity;

import java.util.List;

public interface MenuService extends IService<MenuEntity> {

    List<MenuEntity> getAllMenu();

    List<MenuEntity> getSecondMenu(Integer parentId);

    List<MenuEntity> getFirstMenu();
}

