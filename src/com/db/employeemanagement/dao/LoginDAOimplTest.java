package com.db.employeemanagement.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagement.bean.LoginBean;

public class LoginDAOimplTest {

	@Test
	public void testAuthenticate(){
		LoginBean login=new LoginBean("admin","root");
		LoginDAOimpl loginDAOimpl=new LoginDAOimpl();
		boolean result=loginDAOimpl.authenticate(login);
		Assertions.assertTrue(result,"Result should be true");
	}
}
