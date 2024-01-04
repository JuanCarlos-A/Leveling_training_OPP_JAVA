package session_1.task_2;

public class LuxuryCar{
    //Atributos
    private String placa;
    public byte numRuedas;
    public short kilometraje;
    public String color;
    public boolean electrico;
    public double precio;

    //Constructor

    public LuxuryCar(String placa, byte numRuedas, short kilometraje, String color, boolean electrico, double precio) {
        this.placa = placa;
        this.numRuedas = numRuedas;
        this.kilometraje = kilometraje;
        this.color = color;
        this.electrico = electrico;
        this.precio = precio;
    }

    //Metodo Gettter
    public void getInformation(){
        System.out.println("La placa de carro de lujo es "+ placa);
        System.out.println("El numero de ruedas es "+numRuedas);
        System.out.println("El kilometraje que tiene es "+kilometraje+"(Km)");
        System.out.println("Su color es "+color);
        System.out.println("¿Es electrico? : "+electrico);
        System.out.println("El precio es $"+precio);
    }
}