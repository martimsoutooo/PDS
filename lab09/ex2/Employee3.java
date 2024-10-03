
class Employee3{
		
	private double salary;
	private Person3 person;
	private BankAccount3 account;

	public Employee3(Person3 person, double salary) {
		this.salary = salary;
		this.person = person;
		account = new BankAccountImplProxy3(new BankAccountImpl3("banco", 0));
	}

	public double getSalary() {
		return salary;
	}

	public Person3 getPerson() {
		return person;
	}

	public BankAccount3 getBankAccount() {
		return account;
	}

	public void facade() {
		
	}
}