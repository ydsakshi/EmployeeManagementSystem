package com.db.employeemanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.employeemanagement.bean.LoginBean;
import com.db.employeemanagement.util.DBUtil;

public class LoginDAOimpl implements LoginDAO {

	public boolean authenticate(LoginBean login) {
		// TODO Auto-generated method stub
		String query = "select * from login_table where username=? and password=?";
		Connection connection = null;
		// getting statement type object
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DBUtil.getConnection();
		// statement/ preparedstatement /callablestatement
		try {
			preparedStatement = connection.prepareStatement(query);
			// provide values for ? mark by using this method(starts with 1)
			preparedStatement.setString(1, login.getUserName());
			preparedStatement.setString(2, login.getPassword());
			// now need to hit the database
			// executeQuery(DQL), executeUpdate(DML), execute(DDL)
			resultSet = preparedStatement.executeQuery();

			// now want to travel the result(if vs while consideration),SONARq
			if (resultSet.next()) {
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for all closures
		finally {
			DBUtil.closeConnection(connection);
		}

		return false;
	}

}
