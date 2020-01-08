package com.chinasoft.service.impl;

import java.util.List;

import com.chinasoft.dao.MaterialDao;
import com.chinasoft.dao.impl.MaterialDaoImpl;
import com.chinasoft.pojo.Material;
import com.chinasoft.service.MaterialService;

public class MaterialServiceImpl implements MaterialService {
	private MaterialDao materialDao = new MaterialDaoImpl();

	@Override
	public List<Material> show(String sql) {
		
		return materialDao.selAll(sql);
	}
	
}
