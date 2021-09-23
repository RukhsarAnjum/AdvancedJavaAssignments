<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Member</title>

<script src="resources/js/bootstrap.min.js"></script>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<%
%>
</head>
<body>
    <div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
                <form class="form-horizontal" action="/trainingweb-0.0.1-SNAPSHOT/login" method="GET">
                    <div class="form-group">
                    	<div class="col-md-4">
                    		<input id="username" name="username" type="text" placeholder="Enter username"class="form-control input-md">
                        </div>

                        <div class="col-md-4">
                           <input id="password" name="password" type="password" placeholder="Enter password"class="form-control input-md">
                        </div>

                        <div class="col-md-4">
                           <input  type="submit" value="Login" class="form-control input-md">
                        </div>

                </form>
            </div>
        </div>
    </div>
  </body>
</html>