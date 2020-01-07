package com.chinasoft.dao.impl;

import java.sql.DriverManager;

import com.chinasoft.dao.UserDao;
import com.mysql.cj.jdbc.Driver;

public class UserDaoImpl implements UserDao{
	
	/**
	 * 
	 * µÇÂ¼
	 * */
	@Override
	public int userLogin(String userName, String userPass) {
		int flag = 0;
		
		private final String URL = "";
		Class.forName("com.mysql.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql//47.98.57.181:888/Work", "Word", "TfhiLe6ed4WWWLdM")
		
		return 0;
	}

}
