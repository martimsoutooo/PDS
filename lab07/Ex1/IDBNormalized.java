package Ex1;

interface IDBNormalized {
    void addEmpregado(String nome, String apelido, long codigo, double salario);
    void removeEmpregado(long codigo);
    boolean isEmpregado(long codigo);
    void printEmpregados();
}

