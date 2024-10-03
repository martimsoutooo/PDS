
class Employee2{
	private double salary;
	private Person2 name;
	private BankAccount2 bankAccount;
	
	public Employee2(Person2 name, double salary) {
		this.name = name;
		this.salary = salary;
		bankAccount = new BankAccountImplProxy2(new BankAccountImpl2("PeDeMeia", 0));
	}

	public double getSalary() {
		return salary;
	}

	public BankAccount2 getBankAccount() {
		return bankAccount;
	}

	public Person2 getName() {
		return name;
	}
}