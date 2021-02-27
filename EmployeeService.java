package com.adrien.demo.service;

import java.util.List;


import com.adrien.demo.model.Employee;



public interface EmployeeService {
   List<Employee> getAllEmployees();
   void saveEmployee(Employee employee);
   Employee getEmployeeById(long id);
   void deleteEmployeeById(long id);
}
