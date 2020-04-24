<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1>구구단 출력(폼)</h1>
<%
	String gugu[] = request.getParameterValues("dan");

	String str = "";
	for(int j=0; j<gugu.length; j++){
		int dan = Integer.parseInt(gugu[j]);
		for(int i=1; i<=9; i++){
			str += dan + "x" + i + "=" + dan*i + "<br>"; 
		}str+="<br>";
	}
	out.println(str);
	response.sendRedirect("test.jsp");
%>
