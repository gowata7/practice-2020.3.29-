<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<form action="memProc.jsp">
<table border=1>
	<tr>
		<td>UserID</td>
		<td><input type="text" name="id"></td>
	</tr>
	<tr>
		<td>UserPW</td>
		<td><input type="password" name="pwd"></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><input type="radio" name="sex" value="male">��
			<input type="radio" name="sex" value="female">��</td>
	</tr>
	<tr>
		<td>Department</td>
		<td>
			<select name="department">
				<option value="security" selected>���Ȱ�</option>
				<option value="animal">�ֵ���</option>
				<option value="computer">�İ���</option>
			</select><br>
		</td>
	</tr>
	<tr>
		<td>Hobby</td>
		<td>
		<input type="checkbox" name="hobby" value="baseball">baseball
		<input type="checkbox" name="hobby" value="basketball">basketball
		<input type="checkbox" name="hobby" value="soccer">soccer
		<br>
		</td>
	</tr>
	<tr align="center">
		<td colspan=2><input type="submit" value="����"> <input type="reset" value="�ʱ�ȭ"></td>
	</tr>
</table>
</form>