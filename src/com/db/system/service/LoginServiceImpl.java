package com.db.system.service;

import com.db.employeemanagement.bean.LoginBean;
import com.db.employeemanagement.dao.LoginDAO;
import com.db.employeemanagement.dao.LoginDAOimpl;

public class LoginServiceImpl implements LoginService {
//loose coupling example
	LoginDAO loginDAO=new LoginDAOimpl();
//	service should now handle the dao object
	public boolean authenticate(LoginBean loginBean) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(loginBean);
		
	}

}
