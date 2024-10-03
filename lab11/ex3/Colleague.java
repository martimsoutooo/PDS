package lab11.ex3;

import java.util.ArrayList;
import java.util.List;

class Colleague {
    private static int counter = 1;
    private int id;
    private Mediator mediator;
    private List<Integer> blockedSenders;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
        this.id = counter++;
        this.blockedSenders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void blockSender(int senderId) {
        blockedSenders.add(senderId);
    }

    public void sendMessage(String message, Colleague receiver) {
        System.out.println("O colega " + id + " envia: " + message);
        mediator.sendMessage(message, this, receiver);
    }

    public void receiveMessage(String message, Colleague sender) {
        if (!blockedSenders.contains(sender.getId())) {
            System.out.println("O colega " + id + " recebeu do colega " + sender.getId() + ": " + message);
        } else {
            System.out.println("O colega " + id + " bloqueou o colega " + sender.getId());
        }
    }
}
