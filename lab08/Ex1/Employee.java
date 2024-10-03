package lab08.Ex1;

import java.util.Date;

public class Employee implements IEmployee{
    private String name;
    private Date startDate;
    private Date endDate;

    Employee(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void start(Date startDate) {
        this.startDate = startDate;
        System.out.println("Employee " + name + " started on " + startDate);
    }

    @Override
    public void terminate(Date endDate) {
        this.endDate = endDate;
        System.out.println("Employee " + name + " ended on " + endDate);
    }

    @Override
    public void work() {
        System.out.println("Employee " + name + " is working");
    }


    
}
