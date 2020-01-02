package com.chinasoft.service.impl;

import com.chinasoft.dao.AdminDao; 
import com.chinasoft.dao.impl.AdminDaoImpl;
import com.chinasoft.service.AdminService;

public class AdminServiceImpl implements AdminService{
	private AdminDao adminDao = new AdminDaoImpl();
	
	/**
	 * 
	 * 管理员登录校验
	 * */
	@Override
	public int CheckAdminLoginCheck(String adminName, String password) {
		// TODO Auto-generated method stub
		return adminDao.AdminLogin(adminName, password); //返回执行后的结果
	}

}
