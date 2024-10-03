package Ex1;

class PetiscosAdapter implements IDBNormalized {
    private Registos registos;

    public PetiscosAdapter(Registos registos) {
        this.registos = registos;
    }

    @Override
    public void addEmpregado(String nome, String apelido, long codigo, double salario) {
        Empregado emp = new Empregado(nome, apelido, (int) codigo, salario);
        registos.insere(emp);
    }

    @Override
    public void removeEmpregado(long codigo) {
        registos.remove((int) codigo);
    }

    @Override
    public boolean isEmpregado(long codigo) {
        return registos.isEmpregado((int) codigo);
    }

    @Override
    public void printEmpregados() {
        for (Empregado emp : registos.listaDeEmpregados()) {
            System.out.println(emp.nome() + " " + emp.apelido() + " " + emp.salario());
        }
    }
}
