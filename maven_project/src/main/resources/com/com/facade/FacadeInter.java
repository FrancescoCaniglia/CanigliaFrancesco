package com.facade;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface FacadeInter {

	public ResultSet interrogaDB() throws ClassNotFoundException, SQLException;
}
