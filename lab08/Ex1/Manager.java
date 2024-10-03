package lab08.Ex1;

public class Manager extends EmployeeDecorator {
    public Manager(IEmployee employee) {
        super(employee);
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    public void manage() {
        System.out.println("Manager is managing");
    }


}
