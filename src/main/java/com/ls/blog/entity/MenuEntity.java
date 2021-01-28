package com.ls.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName("menu")
public class MenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜单id
	 */
	@TableId
	private Integer menuId;
	/**
	 * 父菜单ID，一级菜单为0
	 */
	private Integer parentId;
	/**
	 * 菜单名称
	 */
	private String menuName;
	/**
	 * 菜单url
	 */
	private String menuUrl;
	/**
	 * 授权(多个用逗号分隔，如：user:list,user:create)
	 */
	private String menuPerms;
	/**
	 * 类型   0：目录   1：菜单   2：按钮
	 */
	private Integer menuType;
	/**
	 * 菜单图标
	 */
	private String menuIcon;
	/**
	 * 排序
	 */
	private Integer orderNum;

}
