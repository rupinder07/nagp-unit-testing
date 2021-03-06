package com.nagarro.nagp.repository;

import com.nagarro.nagp.InvalidRequestException;
import com.nagarro.nagp.domain.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository{


    public Employee getEmployee(){
        return new Employee("1", "NAGP");
    }

    public Employee createEmployee(final Employee employee) {
        if(employee == null){
            throw new InvalidRequestException("Employee must not be null");
        }
        System.out.println("Employee saved");
        return employee;
    }
}
