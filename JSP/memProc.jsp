<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("uID");
	String pw = request.getParameter("pwd");
	String sex = request.getParameter("sex");
	String dep = request.getParameter("department");
	// String hb = request.getParameter("hobby");
	String [] arrHobby = request.getParameterValues("hobby");
	String hb = "";
	for(int i=0; i<arrHobby.length; i++){
		hb += arrHobby[i] + " ";
	}
%>

ID : <%=id%><br>
PW : <%=pw%><br>
Sex : <%=sex%><br>
Department : <%=dep%><br>
Hobby : <%=hb%>
