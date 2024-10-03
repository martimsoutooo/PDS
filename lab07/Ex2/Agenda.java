package Ex2;

import java.util.List;
import java.util.ArrayList;

public class Agenda implements ContactsInterface{
    private ContactsStorageInterface store;
    private List<Contact> contacts = new ArrayList<>();

    public void openAndLoad(ContactsStorageInterface store){
        this.store = store;
        
        for (Contact contact : store.loadContacts()) {
            if (!this.exist(contact)) {
                this.contacts.add(contact);
            }
        }

        System.out.println();
        System.out.println("Contacts list:");
        for (Contact contact : this.contacts) {
            System.out.println(contact.toString());
        }
        System.out.println();
    }

    public void saveAndClose(){
        boolean saved = this.store.saveContacts(this.contacts);

        if (saved) {
            System.out.println("Contacts saved successfully");
        } else {
            System.out.println("Error saving contacts");
        }
    }

    public void saveAndClose(ContactsStorageInterface store){
        boolean saved = store.saveContacts(this.contacts);

        if (saved) {
            System.out.println("Contacts saved successfully");
        } else {
            System.out.println("Error saving contacts");
        }
    }

    public boolean exist(Contact contact){
        for (Contact c : this.contacts) {
            if (c.getName().equals(contact.getName())) {
                return true;
            }
        }
        return false;
    }

    public Contact getByName(String name){
        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                System.out.println("Contact found: " + c.toString());
                return c;
            }
        }
        return null;
    }

    public boolean add(Contact contact){
        if(this.exist(contact)){
            return false;
        }
        this.contacts.add(contact);
        System.out.println("Contact added: " + contact);
        return false;
    }

    public boolean remove(Contact contact){
        if(this.exist(contact)){
            this.contacts.remove(contact);
            System.out.println("Contact removed: " + contact);
            return true;
        }
        return false;
    } 
}
