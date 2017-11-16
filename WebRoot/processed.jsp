<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=uft-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
   <style type="text/css">

                  @font-face{
    font-family:arialuni;
    src:url(/arialuni.ttf);  
    src:url(arial.ttf);  
        src:url(arial unicode ms.ttf); 
    
    
}

              </style>
  </head>
  
  <body>
    您输入的内容是 <br>
<div>
<%
String sentence = (String)request.getAttribute("ValueB");
out.println(sentence);%>
</div>
     <br>
    <div >
<%

List<String> processed  =(List)request.getAttribute( "ValueA");
System.out.println(processed);
out.println(processed);

%>
</div>
  </body>
</html>
