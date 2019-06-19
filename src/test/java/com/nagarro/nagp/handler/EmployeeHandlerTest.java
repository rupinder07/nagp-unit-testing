package com.nagarro.nagp.handler;

import com.nagarro.nagp.domain.Employee;
import com.nagarro.nagp.repository.EmployeeRepository;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Before;

public class EmployeeHandlerTest {

    private EmployeeHandler handler;
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp() {
        employeeRepository = new FakeEmployeeRepository();
        handler = new EmployeeHandler(employeeRepository);
    }

    public void shouldCreateEmployee() {
        final Employee e1 = new Employee("1", "NAGP");
        final Employee employee = handler.createEmployee(e1);
        MatcherAssert.assertThat(employee, Is.is(e1));
    }
}