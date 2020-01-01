package com.chinasoft.adminImpl;

public class adminLoginImpl {
	private int flag = 0;
	private int adminLogin(String adminId,String adminPasswd){
		
		if(adminId.equals("admin"))
			if(adminPasswd.equals("admin"))
				flag = 1;
		return flag;
	}
}
