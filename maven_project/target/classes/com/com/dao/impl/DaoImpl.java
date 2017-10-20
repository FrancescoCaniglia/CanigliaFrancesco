package com.dao.impl;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.dao.DaoInter;

public class DaoImpl implements DaoInter{

static String connectionString="jdbc:mysql://localhost:3306/rubricatel?user=root&password=root";

public Statement connectionDB() throws ClassNotFoundException, SQLException {	
Class.forName("com.mysql.jdbc.Driver");
Connection connection;
connection =(Connection) DriverManager.getConnection(connectionString);
Statement stm = (Statement) connection.createStatement();
	return stm;
	}

public ResultSet queryDB(Statement stm) throws SQLException, ClassNotFoundException {
	stm = connectionDB();
	ResultSet rs = stm.executeQuery("select * from contatto");
	return rs;
			    	
	}
}