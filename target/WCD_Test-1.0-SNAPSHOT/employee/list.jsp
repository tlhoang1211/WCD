<%@ page import="entity.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: vernom
  Date: 21/05/2021
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% ArrayList<Employee> employeeList = (ArrayList<Employee>) request.getAttribute("studentList");%>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
</head>
<body>
    <div class="container" style="margin-top: 50px">
        <h1 style="text-align: center">Employee List</h1>
        <table class="table table-striped" style="margin-top: 30px">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Full Name</th>
                <th scope="col">Birthday</th>
                <th scope="col">Address</th>
                <th scope="col">Position</th>
                <th scope="col">Department</th>
            </tr>
            </thead>
            <tbody>
            <% if (employeeList != null && employeeList.size() > 0) {
                for (int i = 0; i < employeeList.size(); i++) {%>
            <tr>
                <th scope="row">
                    <%= employeeList.get(i).getId()%>
                </th>
                <th>
                    <%= employeeList.get(i).getFullName()%>
                </th>
                <th>
                    <%= employeeList.get(i).getBirthday()%>
                </th>
                <th>
                    <%= employeeList.get(i).getAddress()%>
                </th>
                <th>
                    <%= employeeList.get(i).getPosition()%>
                </th>
                <th>
                    <%= employeeList.get(i).getDepartment()%>
                </th>
            </tr>
            <%
                    }
                }
            %>
            </tbody>
        </table>
    </div>
</body>
</html>
