<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<div class="rating">
	<div class="prefix-rating">
		<table class="table prefix-rating-table">
		<tr>
			<td class="prefix-img-problem"></td>
				<td class="prefix-text">Top Problem</td>
			</tr>
		</table>
	</div>
	<div class="suffix-rating">
		<table class="table table-striped">
			<tbody>
			<c:forEach items="${newestproblem}" var="problem">
				<tr>
					<td>${problem.getProblemID()}</td>
					<td class="table-text-right">${problem.getProblemName()}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>