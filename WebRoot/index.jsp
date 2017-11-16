<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
 <script>
$(document).ready(function(){
	 $("h1").fadeIn(500);
    $("h4").fadeIn(1000);
  
    $("#text").fadeIn(1200);
    
    $("#button").fadeIn(1700);
    
});
</script>
    <base href="<%=basePath%>">
<style>
.container{
padding-right: 15px;
    padding-left: 15px;
    margin-right: auto;
    margin-left: auto;
    
}
.col-center-block{
	float:none;
	
	margin-left:auto;
	margin-right:auto;

}
.row{
padding-left:inherit;
padding-right:inherit;
}
.webbg{
background-image: linear-gradient(120deg, #fdfbfb 0%, #ebedee 100%);
}
.webfont{
background-image: linear-gradient(to top, #cfd9df 0%, #e2ebf0 100%);
}
</style>
    <title>Echo</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

    <!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body class="webbg">
  <br>
   <div class="container">
    <div class="row">
    <h1 id="title" style="display:none;" class="col-md-12 text-center">Hello,Echo!</h1>
    </div>
    </div>
     
    <form name="getSen" action="Servlet/postSen" method="post" >
   <tr>
   <div  class="container">
    <div class="row">
        <h4 id="words" class="col-md-12 text-center" style="display:none;">请输入您的英语段落</h4>
    </div>
</div>

    </tr>
    <div class="container">
    <div class="row">
        <div class=""col-md-4"></div>
  <textarea id="text" style="display:none;" name="sen" class="col-lg-10 col-md-4 col-sm-6 webbg form-control col-center-block" style="padding-right: 15px;padding-left: 15px;"" rows="15"></textarea>
    </div>
    </div>
<div class="container">
    <div class="row">
<button id="button"  type="submit" onClick="return text()" class="col-lg-10 col-md-4 col-sm-6 btn btn-default webfont col-center-block" style="margin-top: 20px; display:none;">submit</button>
    </div>
</div>
    </form>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>

</body>
</html>
