package Ex1;

class SweetAdapter implements IDBNormalized {
    private Database database;

    public SweetAdapter(Database database) {
        this.database = database;
    }

    @Override
    public void addEmpregado(String nome, String apelido, long codigo, double salario) {
        String nomeCompleto = nome + " " + apelido;
        Employee emp = new Employee(nomeCompleto, codigo, salario);
        database.addEmployee(emp);
    }

    @Override
    public void removeEmpregado(long codigo) {
        
        database.deleteEmployee(codigo);
    }

    @Override
    public boolean isEmpregado(long codigo) {
        
        for (Employee e : database.getAllEmployees()) {
            if (e.getEmpNum() == codigo) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printEmpregados() {
        for (Employee e : database.getAllEmployees()) {
            System.out.println(e.getName() + " - " + e.getSalary());
        }
    }
}

