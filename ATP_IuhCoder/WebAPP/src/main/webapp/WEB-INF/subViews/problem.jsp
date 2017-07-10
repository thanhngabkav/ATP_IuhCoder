<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<div class="rating">
	<div class="prefix-rating">
		<table class="table prefix-rating-table">
		<tr>
			<td class="prefix-img-problem"></td>
			<td class="prefix-text">zxzxxzxz</td>
			</tr>
		</table>
	</div>
	<div class="suffix-rating">
		<table class="table table-striped">
			<tbody>
			<c:forEach items="newest-problem" var="problem">
				<tr>
					<td>${problem.ProblemID}</td>
					<td>${problem.ProblemName}</td>
				</tr>
			</c:forEach>
				<tr>
					<td>MD01</td>
					<td>Find The Dog</td>
				</tr>
				<tr>
					<td>MD02</td>
					<td>Find The Monkey</td>
				</tr>
				<tr>
					<td>MD03</td>
					<td>Find The Spider</td>
				</tr>
				<tr>
					<td>MD04</td>
					<td>Find The Hand</td>
				</tr>
				<tr>
					<td>MD05</td>
					<td>Find The F***</td>
				</tr>

			</tbody>
		</table>
	</div>
</div>