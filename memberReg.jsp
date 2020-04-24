<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="regBean1" class="ch07.Member" scope="page"/>
<jsp:setProperty property="*" name="regBean1"/>
<jsp:setProperty property="mem_phone" name="regBean1" param="phone"/>

다음은 작성한 내용입니다.<br>
<p>이름: <jsp:getProperty property="mem_name" name="regBean1"/>
<p>전화번호: <jsp:getProperty property="mem_phone" name="regBean1"/>
<p>이메일주소: <jsp:getProperty property="mem_email" name="regBean1"/>
