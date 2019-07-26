package com.db.system.service;

import com.db.employeemanagement.bean.LoginBean;

public interface LoginService {

	public boolean authenticate(LoginBean loginBean);
}
