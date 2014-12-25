<%--
  Created by IntelliJ IDEA.
  User: limingxing
  Date: 12/25/14
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="/WEB-INF/layouts/fragment/taglib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Management | <sitemesh:title /></title>

    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <meta http-equiv="Cache-Control" content="no-store" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />

    <link rel="shortcut icon" href="${ctx }/resources/favicon.ico" />

    <%@ include file="/WEB-INF/layouts/fragment/common-css.jsp"%>
    <%@ include file="/WEB-INF/layouts/fragment/common-js.jsp"%>

    <sitemesh:head />
</head>

<body>
<!-- HEADER LAYOUT -->
<%@ include file="/WEB-INF/layouts/header/header.jsp"%>
<!-- CONTENT LAYOUT -->
<div class="page-container"  style="margin-top:50px;">
    <div class="page-content background-radial" style="margin-left: 0">
        <!-- PAGE LEVEL BODY SECTION -->
        <sitemesh:body />
    </div>
</div>
<%@ include file="/WEB-INF/layouts/footer/footer.jsp"%>
</body>
</html>