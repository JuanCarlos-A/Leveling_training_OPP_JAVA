package session_1.task_3;

public class Bike {
    //Atributos
    private String placa;
    public byte numRuedas;
    public boolean suspension;
    public String color;
    public boolean electrico;
    public double precio;

    //Constructor

    public Bike(String placa,byte numRuedas, boolean suspension, String color, boolean electrico, double precio) {
        this.placa = placa;
        this.numRuedas = numRuedas;
        this.suspension = suspension;
        this.color = color;
        this.electrico = electrico;
        this.precio = precio;
    }

    //Metodo Gettter
    public void getInformation(){
        System.out.println("La placa de la bicicleta es "+ placa);
        System.out.println("El numero de ruedas es "+numRuedas);
        System.out.println("¿Cuenta con una suspensión? : "+suspension);
        System.out.println("Su color es "+color);
        System.out.println("¿Es electrico? : "+electrico);
        System.out.println("El precio es $"+precio);
    }
}
