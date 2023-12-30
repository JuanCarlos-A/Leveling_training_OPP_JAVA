package session_2.task5;

public class Calculator {
//  Atributos de la clase Calculator
    public double result;

//    Metodo Constructor
    public Calculator() {}

//    Metodos
    public void add(double myInt, double myInt2){
        result = myInt + myInt2;
        System.out.println("El resultado de la suma es :"+result);
    }

    public void subtract(double myInt, double myInt2){
        result = myInt - myInt2;
        System.out.println("El resultado de la resta es:"+result);
    }

    public void multiply(double myInt, double myInt2){
        result = myInt * myInt2;
        System.out.println("El resultado de la multiplicación es:"+result);
    }

    public void divide(double myInt, double myInt2){
        result = myInt / myInt2;
        System.out.println("El resultado de la divición es:"+result);
    }
}
