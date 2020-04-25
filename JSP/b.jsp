<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>b.jsp입니다.</h1>
<%
	// a(서버)측에 c.jsp를 요청하고 c로 넘어간다.
	//response.sendRedirect("c.jsp");   
%>
<!-- URL은 바뀌지 않은 채(b.jsp) c.jsp의 내용을 불러온다.
그 이유는 클라이언트(a)는 서버(b)가 c.jsp로 forward되는지 모르기 때문이다. 리다이렉트는 그것을 알려주는 역할을 한다.-->
<jsp:forward page="c.jsp" /> 