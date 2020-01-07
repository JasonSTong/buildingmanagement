package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.chinasoft.dao.JdbcDao;


/**
 * ���ݿ�  ��ɾ�Ĳ���
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
			Class.forName("com.mysql.jdbc.Driver");	//ѡ������
			connection = DriverManager.getConnection(URL, USERNAME, PWD); //��������
			stmt = connection.createStatement();	// ����sql��䣨��ɾ�ģ�
			cont = stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {	//SQL�쳣�׳�
			e.printStackTrace();
		} catch (Exception e) {	 //���쳣�׳�
			e.printStackTrace();
		} finally {			//�ر�����
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
	 * ���ݿ��ѯ����
	 * 
	 * **/
	@Override
	public int jdbcSel(String sql) {
		// TODO Auto-generated method stub
		return 0;
	}


}
