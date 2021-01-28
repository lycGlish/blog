package com.ls.blog.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName("user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@TableId
	private Long userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String userPassword;
	/**
	 * 用户手机号
	 */
	private String userPhone;
	/**
	 * 用户邮箱
	 */
	private String userEmail;
	/**
	 * 用户等级
	 */
	private String userLevel;
	/**
	 * 用户头像（url）
	 */
	private String userAvatar;
	/**
	 * 用户激活状态（0未激活，1激活，2封禁）
	 */
	private String userStatus;
	/**
	 * 创建时间
	 */
	private Date userCreatetime;
	/**
	 * 上一次登陆时间
	 */
	private Date userLogintime;

}
