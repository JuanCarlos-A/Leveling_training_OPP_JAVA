package session_4.task11;

import java.util.*;
public class Client extends User{
    private int id;
    private String name;
    private int document;
    private List<BankProduct> products;
    //private Productos[] productos;

    // Getters & Setters
    public Client(int id, String name, int document, List<BankProduct> products) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public List<BankProduct> getProducts() {
        return products;
    }

    public void setProducts(List<BankProduct> products) {
        this.products = products;
    }

    // Mostrar productos del cliente
    public void showProducts() {
        System.out.println("Productos del cliente: ");
        for (BankProduct product : products) {
            System.out.println(product);
        }
    }


    // Mostrar info del cliente
    public void showPersonalInfo() {
        System.out.println("Tu Perfil:");
        System.out.println("Nombre: " + getName());
        System.out.println("Documento: " + getDocument());
        System.out.println("Correo: ");
    }

    public void modifyPersonalInfo() {
    }

    public void modifyAccount() {
    }
}