package Ex2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = createFile("contacts.txt");

        ContactsStorageInterface txt = new SAtxt(file);
        Agenda constacts_list = new Agenda();

        constacts_list.openAndLoad(txt);

        // add contacts
        constacts_list.add(new Contact("Joana", "932 123 456"));
        constacts_list.add(new Contact("Maria", "932 143 356"));
        constacts_list.add(new Contact("Martim", "933 612 789"));

        // remove contact by name
        constacts_list.remove(new Contact("Maria", "932 143 356"));


    } 

    public static File createFile(String filename) {
        try {
            File file = new File("lab07/Ex2",filename);
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("guilherme\t912 123 654\n");
            fileWriter.write("joao\t913 124 656\n");
            fileWriter.write("rui\t914 125 657\n");

            fileWriter.close();
            return file;
        } catch (IOException e) {
            System.err.println("Error creating file");
            e.printStackTrace();
            return null;
        }
    }
}
