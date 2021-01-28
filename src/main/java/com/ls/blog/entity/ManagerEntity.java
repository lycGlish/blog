package com.ls.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName("manager")
public class ManagerEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 管理员id
	 */
	@TableId
	private Long managerId;
	/**
	 * 管理员名字
	 */
	private String managerName;
	/**
	 * 管理员邮箱
	 */
	private String managerEmail;
	/**
	 * 管理员电话
	 */
	private String managerPhone;
	/**
	 * 管理员密码
	 */
	private String managerPassword;
	/**
	 * 管理员头像
	 */
	private String managerAvatar;
	/**
	 * 创建时间
	 */
	private Date managerCreatetime;
	/**
	 * 上一次登陆时间
	 */
	private Date managerLogintime;

}
