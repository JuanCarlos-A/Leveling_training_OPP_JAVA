package session_3.task_8;

import java.util.ArrayList;

public class Producto {
//    Atributos de la Clase Producto
    private String nameProduct;
    private double priceProduct;
    private int cantProduct;
    private ArrayList<String> nameProducts = new ArrayList<>();
    private ArrayList<Double> priceProducts = new ArrayList<>();
    private ArrayList<Integer> cantProducts = new ArrayList<>();

//    Metodo Constructor
    public Producto() {}

//    Metodo Getter y Setter

    public ArrayList<Double> getPriceProducts() {
        return priceProducts;
    }

    public ArrayList<Integer> getCantProducts() {
        return cantProducts;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public void setCantProduct(int cantProduct) {
        this.cantProduct = cantProduct;
    }

    public ArrayList<String> getNameProducts() {
        return this.nameProducts;
    }

    public void addProducts() {
        this.nameProducts.add(this.nameProduct);
        this.priceProducts.add(this.priceProduct);
        this.cantProducts.add(this.cantProduct);
    }

    public Double getPriceProducts(int index){
        return priceProducts.get(index);
    }

    public void setList(ArrayList<String> nameProducts,ArrayList<Double> priceProducts,ArrayList<Integer> cantProducts){
        this.nameProducts = nameProducts;
        this.priceProducts = priceProducts;
        this.cantProducts = cantProducts;
    }
}
