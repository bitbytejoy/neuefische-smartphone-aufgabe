package smartphone;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {
    private String model;
    private String brand;
    private Contact[] contacts;

    public Smartphone() {
    }

    public Smartphone(String model, String brand, Contact[] contacts) {
        this.model = model;
        this.brand = brand;
        this.contacts = contacts;
    }

    public void addContact (Contact contact) {
        contacts = Arrays.copyOf(contacts, contacts.length + 1);
        contacts[contacts.length - 1] = contact;
    }

    public Contact getContact(int index) {
        return contacts[index];
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }
}
