package com.chinasoft.pojo;

public class admin {
	
	private String adminId = "";
	private String adminPasswd = "";
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPasswd() {
		return adminPasswd;
	}
	public void setAdminPasswd(String adminPasswd) {
		this.adminPasswd = adminPasswd;
	}
	public admin(String adminId, String adminPasswd) {
		super();
		this.adminId = adminId;
		this.adminPasswd = adminPasswd;
	}
	public admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
