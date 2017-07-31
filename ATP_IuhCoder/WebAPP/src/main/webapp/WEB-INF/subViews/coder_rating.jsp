<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<div class="rating">
	<div class="prefix-rating">
		<table class="table prefix-rating-table">
		<tr>
			<td class="prefix-img"></td>
			<td class="prefix-text">Top Coder</td>
			</tr>
		</table>
	</div>
	<div class="suffix-rating">
		<table class="table table-striped">
			<tbody>
			<c:forEach items="${topcoder}" var="coder">
				<tr>
					<td>${coder.getName()}</td>
					<td class="right">${coder.getNumberSolvedProblem()}</td>
				</tr>
			</c:forEach>
				<tr>
					<td>Nguyen Van B</td>
					<td class="right">1171</td>
				</tr>
				<tr>
					<td>Tran Tien</td>
					<td class="right">1511</td>
				</tr>
				<tr>
					<td>Dinh Thi Van Anh</td>
					<td class="right">1311</td>
				</tr>
				<tr>
					<td>Lung thi Linh Tinh</td>
					<td>1111</td>
				</tr>
				<tr>
					<td>Dai Qua Luoi Nghi</td>
					<td class="right">1211</td>
				</tr>

			</tbody>
		</table>
	</div>
</div>

