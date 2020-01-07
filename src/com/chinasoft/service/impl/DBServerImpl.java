package com.chinasoft.service.impl;

import com.chinasoft.dao.JdbcDao; 
import com.chinasoft.dao.impl.JdbcDaoImpl;
import com.chinasoft.service.DBServer;


public class DBServerImpl implements DBServer{
	private JdbcDao JdbcDao =  new JdbcDaoImpl();
	@Override
	public int jdbcInsUpDelServer(String sql) {
		
		return JdbcDao.jdbcInsUpDel(sql);
	}
	
}
