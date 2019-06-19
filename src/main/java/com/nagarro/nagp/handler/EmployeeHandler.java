package com.nagarro.nagp.handler;

import com.nagarro.nagp.domain.Employee;
import com.nagarro.nagp.repository.EmployeeRepository;
import com.nagarro.nagp.repository.EmployeeRepositoryImpl;

public class EmployeeHandler {

    //shared variable

    private EmployeeRepository repository;

    public EmployeeHandler(final EmployeeRepository repository){
        this.repository = repository;
    }

    private static Employee updatedEmployee;

    public Employee getEmployee(){
        return repository.getEmployee();
    }

    public Employee createEmployee(final Employee employee){
        final Employee savedEmployee = repository.createEmployee(employee);
        return savedEmployee;
    }

    public void updateEmployee(final Employee employee){
        updatedEmployee = employee;
    }

}
