package model;

import entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    private static ArrayList<Employee> list = new ArrayList<>();

    public boolean save(Employee employee) {
        list.add(employee);
        return false;
    }

    public Employee findById(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Employee> findAll() {
        return list;
    }
}
