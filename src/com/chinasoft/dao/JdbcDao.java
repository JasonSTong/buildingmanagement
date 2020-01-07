package com.chinasoft.dao;

import java.sql.SQLException;

public interface JdbcDao {
	int jdbcInsUpDel(String sql); // 操作数据库（增删改）
	
	int jdbcSel(String sql);//操作数据库（查询）
}
