package com.chinasoft.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.chinasoft.dao.MaterialDao;
import com.chinasoft.pojo.Material;

public class MaterialDaoImpl implements MaterialDao{

	private final String URL = "jdbc:mysql://localhost:3306/Work";
	private final String USERNAME = "root";
	private final String PWD = "Ct981228";

	
	@Override
	public List<Material> selAll(String sql) {
		
		List<Material> list = new ArrayList<>();
			Connection connection = null;  //建立连接
			Statement stmt = null;
			ResultSet rs = null;

			try {
				Class.forName("com.mysql.jdbc.Driver");	//选择驱动
				connection = DriverManager.getConnection(URL, USERNAME, PWD); //建立连接
				stmt = connection.createStatement();	// 发送sql语句（查询）
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					list.add(new Material(rs.getInt(1), rs.getString(2),  rs.getInt(3), rs.getFloat(4), rs.getInt(5), rs.getDate(6), rs.getDate(7), rs.getInt(8), rs.getInt(9)));
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {	//SQL异常抛出
				e.printStackTrace();
			} catch (Exception e) {	 //根异常抛出
				e.printStackTrace();
			} finally {			//关闭连接
				try {
					if(rs !=null )
						rs.close();
					if (stmt != null)
						stmt.close();
					if (connection != null)
						connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		return null;
	}
	
}
