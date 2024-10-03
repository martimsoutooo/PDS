package lab11.ex3;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediator();

        Colleague c1 = new Colleague(mediator);
        Colleague c2 = new Colleague(mediator);
        Colleague c3 = new Colleague(mediator);
        Colleague c4 = new Colleague(mediator);

        mediator.addColleague(c1);
        mediator.addColleague(c2);
        mediator.addColleague(c3);
        mediator.addColleague(c4);

        c1.sendMessage("Olá a todos!", null);  // mensagem pública
        c2.sendMessage("Olá colega 3!", c3);   // mensagem privada
        c3.sendMessage("Ola colega 2!", c2);

        c4.blockSender(1);  // colega 4 bloqueia colega 1
        c1.sendMessage("Testar mensagem bloqueada", c4);
    }
}
