package com.chinasoft.dao;

import java.sql.SQLException;

public interface JdbcDao {
	int jdbcInsUpDel(String sql); // �������ݿ⣨��ɾ�ģ�
	
	int jdbcSel(String sql);//�������ݿ⣨��ѯ��
}
