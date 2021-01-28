package com.ls.blog.controller;

import com.ls.blog.entity.ManagerEntity;
import com.ls.blog.service.ManagerService;
import com.ls.blog.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    /**
     * 信息
     */
    @RequestMapping("/info/{managerId}")
    //@RequiresPermissions("c:manager:info")
    public R info(@PathVariable("managerId") Long managerId){
		ManagerEntity manager = managerService.getById(managerId);

        return R.ok().put("manager", manager);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("c:manager:save")
    public R save(@RequestBody ManagerEntity manager){
		managerService.save(manager);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("c:manager:update")
    public R update(@RequestBody ManagerEntity manager){
		managerService.updateById(manager);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("c:manager:delete")
    public R delete(@RequestBody Long[] managerIds){
		managerService.removeByIds(Arrays.asList(managerIds));

        return R.ok();
    }

}
