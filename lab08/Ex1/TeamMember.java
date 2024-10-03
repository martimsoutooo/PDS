package lab08.Ex1;

public class TeamMember extends EmployeeDecorator {
    TeamMember(IEmployee employee) {
        super(employee);
    }
    
    @Override
    public void work() {
        System.out.println("TeamMember is working");
    }
    
    public void colaborate() {
        System.out.println("TeamMember is colaborating");
    }
}
