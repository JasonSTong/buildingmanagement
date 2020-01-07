package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.chinasoft.dao.JdbcDao;


/**
 * 数据库  增删改操作
 * */
public class JdbcDaoImpl implements JdbcDao {

	private final String URL = "jdbc:mysql://localhost:3306/Work";
	private final String USERNAME = "root";
	private final String PWD = "*963.*963.";

	@Override
	public int jdbcInsUpDel(String sql) {
		Connection connection = null;
		Statement stmt = null;
		int cont = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");	//选择驱动
			connection = DriverManager.getConnection(URL, USERNAME, PWD); //建立连接
			stmt = connection.createStatement();	// 发送sql语句（增删改）
			cont = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	//SQL异常抛出
			e.printStackTrace();
		} catch (Exception e) {	 //根异常抛出
			e.printStackTrace();
		} finally {			//关闭连接
			try {
				if (stmt != null)
					stmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return cont;

	}
	
	
	/**
	 * 
	 * 数据库查询操作
	 * 
	 * **/
	@Override
	public int jdbcSel(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}


}
