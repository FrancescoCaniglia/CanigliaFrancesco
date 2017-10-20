package com.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.dao.DaoInter;
import com.dao.impl.DaoImpl;
import com.service.ServiceInter;
import com.mysql.jdbc.Statement;

public class ServiceImpl implements ServiceInter {
	
	
	
	public ResultSet interrogaDB() throws ClassNotFoundException, SQLException {
		DaoInter dao = new DaoImpl();
		Statement stm = dao.connectionDB();
		ResultSet a= dao.queryDB(stm);
		return a;
		
		
		
	}

}
