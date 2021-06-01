<%--
  Created by IntelliJ IDEA.
  User: MH089815
  Date: 5/31/2021
  Time: 1:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
</head>
<body>
    <p>Form To Add Employee</p>
    <form action="http://localhost:8000/employee_services_war/webapi/employeeservice/addemployee" method="POST">
<%--        <input type="text" name="id" placeholder="id">--%>
        <input type="text" name="name" placeholder="name">
        <input type="text" name="dept" placeholder="dept">
        <input type="text" name="salary" placeholder="salary">
        <input type="submit" value="save">
    </form>
<%--    <script>--%>
<%--            let currentUrl="http://localhost:8000/employee_services_war/webapi/employeeservice/addemployee";--%>
<%--            if(currentUrl){--%>
<%--                window.location="http://localhost:8000/employee_services_war/webapi/employeeservice/emplist";--%>
<%--            }--%>

<%--        setTimeout('pageredirect()',5000);--%>
<%--    </script>--%>
</body>
</html>
