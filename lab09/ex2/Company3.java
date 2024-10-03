import java.util.ArrayList;
import java.util.List;

class Company3 { 
    public static User3 user; 
    private List<Person3> employees = new ArrayList<>();
    
    public void admitEmployee(Person3 person) {
        
        SocialSecurity.register(person);
        Insurance.register(person);
        CardFunc.issueCard(person);
        Parking.allowIfEligible(person);

        
        employees.add(person);
        System.out.println("Admitted new employee: " + person.getName());
    }

    public List<Person3> employees() {
        return employees;
    }


}