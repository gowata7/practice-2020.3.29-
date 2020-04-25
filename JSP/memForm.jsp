<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<h1>회원등록(Form)</h1>
<form action="memProc.jsp">
	아이디 : <input type="text" name="uID"><br>
	비밀번호 : <input type="password" name="pwd"><br>
	성별 : <input type="radio" name="sex" value="man" checked>남
		  <input type="radio" name="sex" value="woman">여<br>
	학과 : <select name="department">
			<option value="computer">컴공과</option>
			<option value="security" selected>보안과</option>
			<option value="animal">애동과</option>
		 </select><br>
	취미 : <input type="checkbox" name="hobby" value="soccer">축구
		 <input type="checkbox" name="hobby" value="basketball">농구
		 <input type="checkbox" name="hobby" value="baseball">야구<br>
	<input type="submit" value="등록">
	<input type="reset" value="재작성">
</form>
