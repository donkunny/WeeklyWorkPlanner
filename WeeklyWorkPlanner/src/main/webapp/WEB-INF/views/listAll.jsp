<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="true" %>

<!doctype html>
<html>
<head>
	<style type="text/css">
	</style>
</head>
<body>
	
	<div class="test_board">
	<table class="table table-hover">
	<h4 align="center"><strong>test 게시판</strong></h4>
	<thread>
		<tr>
			<th>empNo</th>
			<th>eName</th>
		</tr>
	</thread>
	<tbody>
		<c:forEach items="${list}" var="testDTO">
			<tr>
				<td>${testDTO.empNo}</td>
				<td>${testDTO.eName}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	</div>
</body>
</html>