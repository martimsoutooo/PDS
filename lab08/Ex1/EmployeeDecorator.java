package lab08.Ex1;

import java.util.Date;

public class EmployeeDecorator implements IEmployee{    
    private IEmployee employee;
    
    public EmployeeDecorator(IEmployee employee) {
        this.employee = employee;
    }

    @Override
    public void start(Date date) {
        employee.start(date);
    }

    @Override
    public void terminate(Date date) {
        employee.terminate(date);
    }

    @Override
    public void work() {
        employee.work();
    }
}
