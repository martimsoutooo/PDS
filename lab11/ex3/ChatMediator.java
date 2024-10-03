package lab11.ex3;

import java.util.ArrayList;
import java.util.List;

class ChatMediator implements Mediator {
    private List<Colleague> colleagues;

    public ChatMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague sender, Colleague receiver) {
        if (receiver == null) {
            for (Colleague colleague : colleagues) {
                if (colleague != sender) {
                    colleague.receiveMessage(message, sender);
                }
            }
        } else {
            receiver.receiveMessage(message, sender);
        }
    }
}
