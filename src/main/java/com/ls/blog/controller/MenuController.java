package com.ls.blog.controller;

import com.ls.blog.entity.MenuEntity;
import com.ls.blog.service.MenuService;
import com.ls.blog.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/getAllMenu")
    public R getAllMenu() {
        List<MenuEntity> menuEntities = menuService.getAllMenu();
        return R.ok().put("data", menuEntities);
    }

    @GetMapping("/getFirstMenu")
    public R getFirstMenu() {
        List<MenuEntity> firstMenuEntities = menuService.getFirstMenu();
        return R.ok().put("data", firstMenuEntities);
    }

    @GetMapping("/getSecondMenu")
    public R getSecondMenu(Integer parentId) {
        if (parentId != 0) {
            List<MenuEntity> secondMenuEntities = menuService.getSecondMenu(parentId);
            return R.ok().put("data", secondMenuEntities);
        } else {
            return R.ok().put("data", "该菜单是根目录");
        }
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("menu:save")
    public R save(@RequestBody MenuEntity menu) {
        menuService.save(menu);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("menu:update")
    public R update(@RequestBody MenuEntity menu) {
        menuService.updateById(menu);

        return R.ok();
    }

}
