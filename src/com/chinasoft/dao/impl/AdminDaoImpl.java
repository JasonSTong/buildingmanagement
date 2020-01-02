package com.chinasoft.dao.impl;

import com.chinasoft.dao.AdminDao;

public class AdminDaoImpl implements AdminDao{

		/**
		 * 
		 * π‹¿Ì‘±µ«¬º
		 * */
	@Override
	public int AdminLogin(String adminName, String password) {
		int flag = 0;
		if (adminName.equals("admin"))
			if (password.equals("admin"))
				flag = 1;
		return flag;
	}

}
