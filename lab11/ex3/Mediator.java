package lab11.ex3;

interface Mediator {
    void sendMessage(String message, Colleague sender, Colleague receiver);
    void addColleague(Colleague colleague);
}

