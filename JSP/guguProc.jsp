<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- <h1>구구단 출력</h1> -->
<span style="font-size : 50px; color:red;">구구단 출력<br></span>
<%
	String dan2 = request.getParameter("dan");
	String font = request.getParameter("fSize");
	String css = request.getParameter("fSizeCSS");
	String start = "";
	String end = "";
	String color = request.getParameter("fColor");

	if(css!=""){
		start = "<span style='font-size:"+css+"px;"+" color:"+color+";'";
		end = "</span>";
	}else{
		start = "<font size="+font+" color="+color+">";
		end = "</font>";
	}
	
	String strGugu = start;
	
	if(dan2.equals("all")){
		for(int j=1; j<=9; j++){
			for(int i=2; i<=9; i++){
				strGugu += j + "*" + i + "=" + j*i+"<br>";
			}strGugu += "<br>";
		}
	}else{
		int dan3 = Integer.parseInt(dan2);
			for(int j=1; j<=9; j++){
				strGugu += dan3 + "*" + j + "=" + dan3*j+"<br>";	
			}
	}
	out.println(strGugu);
	out.println(end);
	
	

	
%>
