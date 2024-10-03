package Ex1;

class NewDB {
    private IDBNormalized sweetsDB;
    private IDBNormalized petiscosDB;

    public NewDB(IDBNormalized sweetsDB, IDBNormalized petiscosDB) {
        this.sweetsDB = sweetsDB;
        this.petiscosDB = petiscosDB;
    }

    public void addEmpregado(String nome, String apelido, long codigo, double salario) {
        
        sweetsDB.addEmpregado(nome, apelido, codigo, salario);
        petiscosDB.addEmpregado(nome, apelido, codigo, salario);
    }

    public void removeEmpregado(long codigo) {
        sweetsDB.removeEmpregado(codigo);
        petiscosDB.removeEmpregado(codigo);
    }

    public boolean isEmpregado(long codigo) {
        
        return sweetsDB.isEmpregado(codigo) && petiscosDB.isEmpregado(codigo);
    }

    public void printEmpregados() {
        System.out.println("Sweet:");
        sweetsDB.printEmpregados();
        System.out.println("Petiscos:");
        petiscosDB.printEmpregados();
    }
}

