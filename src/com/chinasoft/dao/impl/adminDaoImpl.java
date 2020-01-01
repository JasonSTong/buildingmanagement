package com.chinasoft.dao.impl;

import com.chinasoft.dao.adminDao;

public class adminDaoImpl implements adminDao {

	@Override
	public int checkAdminLogin(String adminName, String password) {
		int flag = 0;
		if (adminName.equals("admin"))
			if (password.equals("admin"))
				flag = 1;
		return flag;
	}

}
