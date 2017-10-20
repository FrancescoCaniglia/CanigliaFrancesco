package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public interface DaoInter {

public Statement connectionDB() throws ClassNotFoundException, SQLException;
public ResultSet queryDB(Statement stm) throws SQLException, ClassNotFoundException;
	
}
