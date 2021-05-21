package controller;

import entity.Employee;
import model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AddEmployeeServlet extends HttpServlet {
    private final EmployeeModel employeeModel = new EmployeeModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/employee/employee.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String fullName = req.getParameter("fullName");
        String birthday = req.getParameter("birthday");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        try {
            date = sdf.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String address = req.getParameter("address");
        String position = req.getParameter("position");
        String department = req.getParameter("department");
        Employee employee = new Employee(id, fullName, date, address, position, department);
        employeeModel.save(employee);
        resp.sendRedirect("/employee/list.jsp");
    }
}
