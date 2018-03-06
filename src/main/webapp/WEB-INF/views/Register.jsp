<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
  <h1>HNS</h1>
  <hr>

  <div class="form">
    <form action="RegisterOk" method="post">
      <table>
        <tr>
          <td>UserName : </td>
          <td><input id="UserName" name="UserName"></td>
        </tr>
        <tr>
          <td>Password : </td>
          <td><input id="Password" name="Password"></td>
        </tr>
        <tr>
        	<td><input type="submit" value="Submit"></td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>