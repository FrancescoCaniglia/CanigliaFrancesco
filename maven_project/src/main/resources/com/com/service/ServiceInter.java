package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ServiceInter {
	
	public ResultSet interrogaDB() throws ClassNotFoundException, SQLException;

}
