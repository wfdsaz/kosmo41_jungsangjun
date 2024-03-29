<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<meta charset="UTF-8">

    <!-- Required meta tags -->
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<style>
	.test1{ 
	
	}
</style>

</head>
<body class="container">
<form action="login.do"  method="post">	
	<input type="button" value="정보수정" onclick="javadcript:window.location='modify1.jsp'"> &nbsp;
	<input type="button" value="로그아웃" onclick="javadcript:window.location='login.jsp'">	&nbsp;		
	<input type="button" value="채팅" onclick="javadcript:window.location='client2.html'">	&nbsp;	
</form>

	<table class="table table-striped" width="500" >
		<tr>
			 <th scope="col">번호</th>
     		 <th scope="col">이름</th>
      		 <th scope="col">제목</th>
     		 <th scope="col">날짜</th>
     		 <th scope="col">히트</th>
		</tr>
		<c:forEach items="${list}" var="dto">
		<tr>
			<td>${dto.bId}</td>
			<td>${dto.bName}</td>
			<td>
				<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
				<a href="content_view.do?bId=${dto.bId}">${dto.bTitle}</a></td>
			<td>${dto.bDate}</td>
			<td>${dto.bHit}</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="5"><a href="write_view.do">글작성</a> </td>
			</tr>
			
			<form>
				<select name="keyfield">				
   		 			<option value="1">이름</option>
   		 			<option value="2">제목</option>
   		 			<option value="3">내용</option>
   					<option value="4">제목 + 내용</option>
				</select>	
    			<input type="text" size="20" name="keyword"/>&nbsp;
    			<input type="submit" value="검색"/>
			</form> 			
		<tr>
			<td colspan="5" class="justify-content-center">
			<nav aria-label="Page navigation example" >
			 <ul class="pagination">
			<!-- 처음 -->
			<c:choose>
				<c:when test="${(page.curPage - 1) < 1}">
					<li class="page-item"><a class="page-link" href="list.do?page=1">First</a></li>
				</c:when>
				<c:otherwise>
					 <li class="page-item"><a class="page-link" href="list.do?page=1">First</a></li>
				</c:otherwise>
			</c:choose>
			
			<!-- 이전 -->
			<c:choose>
				<c:when test="${(page.curPage - 1) < 1}">
					 <li class="page-item"><a class="page-link" href="list.do?page=${page.curPage - 1}">Prev</a></li>
				</c:when>
				<c:otherwise>
					 <li class="page-item"><a class="page-link" href="list.do?page=${page.curPage - 1}">Prev</a></li>
				</c:otherwise>
			</c:choose>
			
			<!-- 개별 페이지 -->
			<c:forEach var="fEach" begin="${page.startPage}" end="${page.endPage}" step="1">
				<c:choose>
					<c:when test="${page.curPage == fEach}">
						[${fEach}] &nbsp;
					</c:when>
					<c:otherwise>
						 <li class="page-item"><a class="page-link" href="list.do?page=${fEach}">${fEach}</a></li>&nbsp;
					</c:otherwise>
				</c:choose>
			</c:forEach>
			
			<!-- 다음 -->
			<c:choose>
				<c:when test="${(page.curPage + 1) > page.totalPage}">
					 <li class="page-item"><a class="page-link" href="list.do?page=${page.curPage + 1}">Next</a></li>
				</c:when>
				<c:otherwise>
					 <li class="page-item"><a class="page-link" href="list.do?page=${page.curPage + 1}">Next</a></li>
				</c:otherwise>
			</c:choose>
			<!-- 끝 -->
			<c:choose>
				<c:when test="${page.curPage == page.totalPage}">
					 <li class="page-item"><a class="page-link" href="list.do?page=${page.totalPage}">End</a></li>
				</c:when>
				<c:otherwise>
					 <li class="page-item"><a class="page-link" href="list.do?page=${page.totalPage}">End</a></li>
				</c:otherwise>
			</c:choose>
			</ul>
			</nav>
			</td>	
		</tr>			 
	</table>
		
 	<!-- Optional JavaScript -->
 	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
 	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script> 
 	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 
</body>
</html>