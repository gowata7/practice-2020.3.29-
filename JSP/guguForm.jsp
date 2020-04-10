<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<span style="font-size : 40px; color:red;">구구단 폼<br></span>

<form action="guguProc.jsp">
	구구단 : <input type="radio" name=dan value="2">2단
			<input type="radio" name=dan value="3">3단
			<input type="radio" name=dan value="4">4단
			<input type="radio" name=dan value="5">5단
			<input type="radio" name=dan value="6">6단
			<input type="radio" name=dan value="7">7단
			<input type="radio" name=dan value="8">8단
			<input type="radio" name=dan value="9">9단
			<input type="radio" name=dan value="all">all<br>
	폰트크기(태그) : <input type="radio" name=fSize value="1">1
			<input type="radio" name=fSize value="2">2
			<input type="radio" name=fSize value="3">3
			<input type="radio" name=fSize value="4" checked>4
			<input type="radio" name=fSize value="5">5
			<input type="radio" name=fSize value="6">6
	폰트크기(CSS) : <input type="text" name=fSizeCSS><br>
	폰트색상 : <input type="radio" name=fColor value="red">빨강
			<input type="radio" name=fColor value="blue">파랑
			<input type="radio" name=fColor value="yellow">노랑
		<input type="submit" value="출력">
</form>
