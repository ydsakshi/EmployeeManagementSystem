package com.db.employeemanagement.dao;

import com.db.employeemanagement.bean.LoginBean;

public interface LoginDAO {
	
	public boolean authenticate(LoginBean login);
}
