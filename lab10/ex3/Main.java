package lab10.ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Command addCommand = new AddCommand<>(list, "Elemento1");
        Command removeCommand = new RemoveCommand<>(list, "Elemento1");

        addCommand.execute();
        System.out.println("Lista após adicionar: " + list);

        addCommand.undo();
        System.out.println("Lista após desfazer adição: " + list);

        addCommand.execute();  
        removeCommand.execute();
        System.out.println("Lista após remover: " + list);

        removeCommand.undo();
        System.out.println("Lista após desfazer remoção: " + list);
    }
}

