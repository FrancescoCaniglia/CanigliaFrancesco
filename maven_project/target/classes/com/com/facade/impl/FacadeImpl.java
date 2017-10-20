package com.facade.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.facade.FacadeInter;
import com.service.ServiceInter;
import com.service.impl.ServiceImpl;

public class FacadeImpl implements FacadeInter{

	public ResultSet interrogaDB() throws ClassNotFoundException, SQLException {
		ServiceInter serv =new ServiceImpl();
		ResultSet s = serv.interrogaDB();
		return s;
		
	}

	
}
