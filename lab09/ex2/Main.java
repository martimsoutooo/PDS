public class Main {
	public static void main(String[] args) {
        System.out.println("\nCriar uma empresa...");
        Company3 shark = new Company3();
        Company3.user = User3.COMPANY3;
        System.out.println("\nAdicionar empregados....");
        shark.admitEmployee(new Person3("Maria Silva",1000));
        shark.admitEmployee(new Person3("Manuel Pereira",900));
        shark.admitEmployee(new Person3("Aurora Machado",1200));
        shark.admitEmployee(new Person3("Augusto Lima",1100));

        
    }
}