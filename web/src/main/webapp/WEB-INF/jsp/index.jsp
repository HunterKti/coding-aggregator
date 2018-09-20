<%--
  Created by IntelliJ IDEA.
  User: tiankun
  Date: 2018/9/20
  Time: 下午10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<script type="text/javascript" src="/util/jquery-3.3.1.min.js?v=2"></script>
<script>
    $(function () {
        $.ajax({
            type:'post',
            url:'/api/hello',
            success:function(data){
                $("#ip")[0].innerHTML=data;
            }
        });
    })
</script>
<body>
    <span id="ip"></span>
</body>
</html>
