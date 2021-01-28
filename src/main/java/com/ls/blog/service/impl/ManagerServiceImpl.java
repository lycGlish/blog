package com.ls.blog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ls.blog.dao.ManagerDao;
import com.ls.blog.entity.ManagerEntity;
import com.ls.blog.service.ManagerService;
import org.springframework.stereotype.Service;

@Service("managerService")
public class ManagerServiceImpl extends ServiceImpl<ManagerDao, ManagerEntity> implements ManagerService {


}