package com.chinasoft.pojo;

public class User {
	private String userName;
	private String userPass;
	private int ownerId;//ҵ��ID����������ҵ����Ա��������Ա���⻧��
	private int roleId ; //��ɫID��
	
	public User(String userName, String userPass, int ownerId, int roleId) {
		super();
		this.userName = userName;
		this.userPass = userPass;
		this.ownerId = ownerId;
		this.roleId = roleId;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
