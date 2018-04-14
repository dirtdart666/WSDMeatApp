<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="uts.wsd.*"%>
<%
	String filePath = application.getRealPath("WEB-INF/creators.xml");
%>
<jsp:useBean id="meetApp" class="uts.wsd.MeatApp" scope="application">
	<jsp:setProperty name="meetApp" property="creatorFilePath"
		value="<%=filePath%>" />
</jsp:useBean>
<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");

	Creators creators = meetApp.getCreators();
	Creator creator = creators.login(username, password);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		if (creator != null) {
	%>
	<p>Login Successful</p>

	<p>
		Welcome, your username is
		<%=username%>
	</p>
	<p>
		Welcome, your password is
		<%=password%>
	</p>


	<%
		} else {
	%>
	<p>Login Unsuccessful</p>

	<%
		}
	%>
</body>
</html>