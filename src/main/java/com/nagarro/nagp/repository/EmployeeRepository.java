package com.nagarro.nagp.repository;

import com.nagarro.nagp.domain.Employee;

public interface EmployeeRepository {

    Employee createEmployee(Employee e);

    Employee getEmployee();

}
