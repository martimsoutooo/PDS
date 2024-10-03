package lab08.Ex1;

public class TeamLeader extends EmployeeDecorator {

    public TeamLeader(IEmployee employee) {
        super(employee);
    }

    @Override
    public void work() {
        System.out.println("TeamLeader is working");
    }

    public void plan() {
        System.out.println("TeamLeader is planing");
    }
    
}
