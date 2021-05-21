<%--
  Created by IntelliJ IDEA.
  User: vernom
  Date: 21/05/2021
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        * {
            box-sizing: border-box;
        }

        input[type=text], select, textarea {
            width: 100%;
            padding: 12px;
            border: 1px solid #ccc;
            border-radius: 4px;
            resize: vertical;
        }

        label {
            padding: 12px 12px 12px 0;
            display: inline-block;
        }

        input[type=submit] {
            background-color: #04AA6D;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            float: right;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }

        .container {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }

        .col-25 {
            float: left;
            width: 25%;
            margin-top: 6px;
        }

        .col-75 {
            float: left;
            width: 75%;
            margin-top: 6px;
        }

        /* Clear floats after the columns */
        .row:after {
            content: "";
            display: table;
            clear: both;
        }

        /* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
        @media screen and (max-width: 600px) {
            .col-25, .col-75, input[type=submit] {
                width: 100%;
                margin-top: 0;
            }
        }
    </style>
</head>
<body>
    <h1>New Employee:</h1>
    <p>Please fill out the information in the boxes below</p>
    <div class="container">
    <form action="/employee/add" method="post">
        <div class="row">
            <div class="col-25">
                <label for="id">Id</label>
            </div>
            <div class="col-75">
                <input type="text" id="id" name="id">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="fullname">Full Name</label>
            </div>
            <div class="col-75">
                <input type="text" id="fullName" name="fullname">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="birthday">Birthday</label>
            </div>
            <div class="col-75">
                <input type="date" id="birthday" name="birthday">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="address">Address</label>
            </div>
            <div class="col-75">
                <input type="text" id="address" name="address">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="position">Position</label>
            </div>
            <div class="col-75">
                <input type="text" id="position" name="position">
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label for="department">Department</label>
            </div>
            <div class="col-75">
                <input type="text" id="department" name="department">
            </div>
        </div>
        <div class="row" style="padding-top: 10px">
            <input type="submit" value="Submit" style="padding-right: 10px">
            <input type="submit" value="Reset">
        </div>
    </form>
    </div>
</body>
</html>
