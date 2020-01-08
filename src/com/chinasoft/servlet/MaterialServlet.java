package com.chinasoft.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinasoft.pojo.Material;
import com.chinasoft.service.MaterialService;
import com.chinasoft.service.impl.MaterialServiceImpl;


public class MaterialServlet extends HttpServlet{
	private MaterialService materialService = new MaterialServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String sql = "select * from RPMS_material" ;
		List<Material> list = materialService.show(sql);
		req.setAttribute("list", list);
		req.getRequestDispatcher("/Front-end/material/materialList.html").forward(req, resp);
	}
}
