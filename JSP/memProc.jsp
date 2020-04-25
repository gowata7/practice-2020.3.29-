<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("utf-8");
	String ID = request.getParameter("id");
	String PWD = request.getParameter("pwd");
	String SEX = request.getParameter("sex");
	String DEP = request.getParameter("department");
	String Hobby[] = request.getParameterValues("hobby");	
	String str = "";
	
	for(int i=0; i<Hobby.length; i++){
		str += Hobby[i] + " ";
	}
%>
ID : <%=ID%><br>
PW : <%=PWD%><br>
SEX : <%=SEX%><br>
DEP : <%=DEP%><br>
Hobby : <%=str%><br>

<%
	response.sendRedirect("memRegOk.jsp?id="+ID);
%>