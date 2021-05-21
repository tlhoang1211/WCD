package controller;

import entity.Employee;
import model.EmployeeModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListEmployeesServlet extends HttpServlet {
    private final EmployeeModel employeeModel = new EmployeeModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> list = employeeModel.findAll();
        req.setAttribute("employeeModel", list);
        req.getRequestDispatcher("/employee/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
    }
}
