package com.nagarro.nagp.handler;

import com.nagarro.nagp.domain.Employee;
import com.nagarro.nagp.repository.EmployeeRepository;

public class EmployeeHandler {

    //shared variable

    private final EmployeeRepository repository = new EmployeeRepository();

    private static Employee updatedEmployee;

    public Employee getEmployee(){
        return repository.getEmployee();
    }

    public void createEmployee(final Employee employee){
        repository.createEmployee(employee);
        updatedEmployee = employee;
    }

    public void updateEmployee(final Employee employee){
        updatedEmployee = employee;
    }

}
