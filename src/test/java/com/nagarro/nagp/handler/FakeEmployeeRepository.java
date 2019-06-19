package com.nagarro.nagp.handler;

import com.nagarro.nagp.domain.Employee;
import com.nagarro.nagp.repository.EmployeeRepository;

public class FakeEmployeeRepository implements EmployeeRepository {

    public Employee createEmployee(final Employee e) {
        return e;
    }

    public Employee getEmployee() {
        return null;
    }
}
