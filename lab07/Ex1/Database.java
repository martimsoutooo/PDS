package Ex1;

import java.util.Vector;

class Database {
    private Vector<Employee> employees;

    public Database() {
        employees = new Vector<>();
    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public void deleteEmployee(long emp_num) {
        employees.removeIf(e -> e.getEmpNum() == emp_num);
    }

    public Employee[] getAllEmployees() {
        return employees.toArray(new Employee[0]);
    }
}
