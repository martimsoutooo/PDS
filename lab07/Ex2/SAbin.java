package Ex2;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class SAbin implements ContactsStorageInterface{
    private File file;

    public SAbin(File readInputFile) {
        this.file = readInputFile;
    }

    public List<Contact> loadContacts() {
        List<Contact> contacts = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(this.file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] parts = line.split("\t");
                Contact contact = new Contact(parts[0], parts[1]);
                contacts.add(contact);
            }
            scanner.close();
            return contacts;

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return null;
        }
    }

    public boolean saveContacts(List<Contact> list) {
        try {
            FileWriter fileWriter = new FileWriter(this.file);
            for (Contact contact : list) {
                fileWriter.write(contact.toString() + "\n");
            }

            fileWriter.close();
            return true;
        } catch (IOException e) {
            System.err.println("Error writing to file");
            return false;
        }
    }  
}
