<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false" %>
<%@include file="common/header.jsp"%>
<div class="page-title">
	<div class="title_left">
		<h3>
			欢迎你：${devUserSession.devName }<strong> | 角色：开发者账户</strong>
			<c:forEach var="appInfo" items="${query }" varStatus="status">
				<tr role="row" class="odd">
					<td tabindex="0" class="sorting_1">${appInfo.softwareName}</td>
					<td>${appInfo.APKName }</td>
					<td>${appInfo.softwareSize }</td>
					<td>${appInfo.flatformName }</td>
					<td>${appInfo.categoryLevel1Name } -> ${appInfo.categoryLevel2Name } -> ${appInfo.categoryLevel3Name }</td>
					<td>${appInfo.statusName }</td>
					<td>${appInfo.downloads }</td>
					<td>${appInfo.versionNo }</td>
					<td>${appInfo.userCode }</td>
					<td>
						<button type="button" class="btn btn-default checkApp"
								appinfoid="${appInfo.id }" versionid="${appInfo.versionId }" status="${appInfo.status }"
								statusname="${appInfo.statusName }"
								data-toggle="tooltip" data-placement="top" title="" data-original-title="查看并审核APP">审核</button>
					</td>
				</tr>
			</c:forEach>
		</h3>
	</div>
</div>
<div class="clearfix"></div>
<%@include file="common/footer.jsp"%>
