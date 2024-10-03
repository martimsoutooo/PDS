package Ex1;
public class Main {
    public static void main(String[] args) {
      
        SweetAdapter sweetsAdapter = new SweetAdapter(new Database());
        PetiscosAdapter petiscosAdapter = new PetiscosAdapter(new Registos());

        
        NewDB newDB = new NewDB(sweetsAdapter, petiscosAdapter);

        
        newDB.addEmpregado("Rui", "Machado", 1, 3000.0);
        newDB.addEmpregado("Katia", "ComKappa", 2, 3200.0);

       
        System.out.println("Empregados após adicionar Rui e Katia:");
        newDB.printEmpregados();

        
        boolean exists = newDB.isEmpregado(1);
        System.out.println("Rui existe na base de dados? " + exists);

        newDB.removeEmpregado(1);
        
        exists = newDB.isEmpregado(1);
        System.out.println("Rui ainda existe após a remoção? " + exists);

        System.out.println("Empregados após remover Rui:");
        newDB.printEmpregados();
    }
}


