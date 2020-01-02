package com.chinasoft.pojo;

public class Admin {
	
	private String adminId = "";
	private String adminPasswd = "";
	
	public Admin(String adminId, String adminPasswd) {
		super();
		this.adminId = adminId;
		this.adminPasswd = adminPasswd;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPasswd=" + adminPasswd + "]";
	}
	
}
