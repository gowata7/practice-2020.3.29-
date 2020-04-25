<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>구구단 출력(처리)</h1>
<!-- 구구단 출력 : 크기(1~7), 색상(R,G,B) 모두 랜덤 출력할 것 -->
<font size=1>구구단</font><br>
<font size=7 color=#FF0000>구구단</font><br>
<font size=7 color=#00FF00>구구단</font><br>
<font size=7 color=#0000FF>구구단</font><br>
<%
	String strDan = "";
	String arrColor [] = {"red","green","blue","pink","purple"};
	// out.println("색상: " + arrColor[index] + "<br>");
	// 기본으로 Math.random은 0<=Math.random()<1 값을 갖는다. 
	for(int dan=2; dan<=9; dan++){
		int index = (int)(Math.random()*arrColor.length);	// 0 <= index <= 2
		int size = (int)(Math.random()*7)+1; // 1~7
		strDan += "<font size="+size+" color="+arrColor[index]+">"+ "<br>";
		for(int i=1; i<=9; i++){
			strDan += dan + " x " + i + " = " + dan*i + "<br>";
		}
		strDan += "</font><br>";
	}
	
	out.println(strDan);
%>
