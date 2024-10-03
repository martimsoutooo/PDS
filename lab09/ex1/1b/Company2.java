import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Company2 {
	
	public static User2 user;
	private List<Employee2> emps = new ArrayList<>();

	public void admitEmployee(Person2 name, double salary) {
		Employee2 e = new Employee2(name, salary);
		emps.add(e);
	}
	
	public void paySalaries(int month) {
		for (Employee2 e : emps) {
			BankAccount2 ba = e.getBankAccount();
			ba.deposit(e.getSalary());
		}
	}
	
	public List<Employee2> employees() {
		return Collections.unmodifiableList(emps);
	}
}