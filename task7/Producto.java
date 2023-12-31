package session_2.task7;
public class Producto {
    //    Atributos
    private String name;
    private double costPrice;
    private double sellingPrice;
    private int quantity;

    //    Metodo Constructor
    public Producto(String name, double costPrice, double sellingPrice, int quantity) {
        this.name = name;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.quantity = quantity;
    }
    //    Metodos
    public String getName() {
        return name;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void sell(int quantitySold) {
        if (quantitySold > 0 && quantitySold <= quantity) {
            quantity -= quantitySold;
            System.out.println(quantitySold + " unidades de " + name + " vendido.");
        } else {
            System.out.println("Cantidad invalida para vender.");
        }
    }
}
