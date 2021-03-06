<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@page isELIgnored="false" %>
<div class="news_content">
	<table class="table borderless">
		<tbody>
		  <tr>
			<td class="icon_news-td"><div class="icon_news"></div></td>
			<td class="title align-bottom">Before contest ( 3 days )</td>
		  </tr>
		  <tr>
			<td></td>
			<td class="content_text">middlest - 12/02/2017
Vào 19g30 Chủ Nhật ngày 19/02/2017, NTUCoder tổ chức vòng thi "NTUCoder Round #20". Kỳ thi gồm 8 bài tập (2 bài dễ, 3 bài trung bình, 3 bài khó), thời gian thi là 210 phút. Người ra đề middlest.
 Xin mời tất cả các thành viên của NTUCoder cùng tham dự. Thời gian đăng ký kể từ bây giờ đến ngay trước lúc bắt đầu thi. Hình thức tính điểm: theo luật thi ACM/ICPC, mỗi lần nộp bài sai hệ số phụ cộng thêm 10 phút. Chúc các bạn một kỳ thi thành công.
</td>
		  </tr>
		</tbody>
	  </table>
</div>

<c:forEach items="${topnews}" var="news">
	<div class="news_content">
		<table class="table borderless">
			<tbody>
			<tr>
				<td class="icon_news-td"><div class="icon_news"></div></td>
				<td class="title align-bottom">${news.getTitle()} sadasdasd asd</td>
			</tr>
			<tr>
				<td></td>
				<td class="content_text">${news.getContent()}</td>
			</tr>
			</tbody>
		</table>
	</div>
</c:forEach>
