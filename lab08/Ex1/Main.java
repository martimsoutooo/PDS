package lab08.Ex1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        IEmployee employee = new Employee("Martim",new Date(), new Date());    
        employee.start(new Date());
        employee.work();
        employee.terminate(new Date());

        employee = new Manager(employee);
        ((Manager) employee).manage();

        employee = new TeamLeader(employee);
        ((TeamLeader) employee).plan();

        employee = new TeamMember(employee);
        ((TeamMember) employee).colaborate();
    }
}
