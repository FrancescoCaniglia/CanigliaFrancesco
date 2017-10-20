<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import ="com.facade.FacadeInter"%>
   <%@ page import ="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<% FacadeInter fcd = (FacadeInter)session.getAttribute("facade");
 ResultSet rs = fcd.interrogaDB(); 
 while (rs.next()){
 String id = rs.getString("id");%>
 <%=id %> 
<% }%>
</body>
</html>


