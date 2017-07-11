<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<div class="rating">
	<div class="prefix-rating">
		<table class="table prefix-rating-table">
		<tr>
			<td class="prefix-img"></td>
			<td class="prefix-text">asdasdasd</td>
			</tr>
		</table>
	</div>
	<div class="suffix-rating">
		<table class="table table-striped">
			<tbody>
			<c:forEach items="${topcoder}" var="coder">
				<tr>
					<td>${coder.getName()}</td>
					<td>${coder.getNumberSolvedProblem()}</td>
				</tr>
			</c:forEach>
				<tr>
					<td>Nguyen Van B</td>
					<td>1171</td>
				</tr>
				<tr>
					<td>Tran Tien</td>
					<td>1511</td>
				</tr>
				<tr>
					<td>Dinh Thi Van Anh</td>
					<td>1311</td>
				</tr>
				<tr>
					<td>Lung thi Linh Tinh</td>
					<td>1111</td>
				</tr>
				<tr>
					<td>Dai Qua Luoi Nghi</td>
					<td>1211</td>
				</tr>

			</tbody>
		</table>
	</div>
</div>

