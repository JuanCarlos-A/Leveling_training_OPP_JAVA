package session_2.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Atributos
        int quest;
        double myInt;
        double myInt2;
//        Metodos Constructores
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

//        Inputs Data
        System.out.println("=======================\n1. Sumar\n2. Resta\n3. Multiplicar\n4. Dividir\n");
        System.out.println("Ingresa el numero de la opción:");
        quest = scanner.nextInt();
        switch (quest){
            case 1:
                System.out.println("Ingresa el primer numero a sumar: ");
                myInt = scanner.nextInt();
                System.out.println("Ingresa el segundo numero a sumar: ");
                myInt2 = scanner.nextInt();
                calculator.add(myInt,myInt2);
                break;
            case 2:
                System.out.println("Ingresa el primer numero a restar: ");
                myInt = scanner.nextInt();
                System.out.println("Ingresa el segundo numero a sumar: ");
                myInt2 = scanner.nextInt();
                calculator.subtract(myInt,myInt2);
                break;
            case 3:
                System.out.println("Ingresa el primer numero a multiplicar: ");
                myInt = scanner.nextInt();
                System.out.println("Ingresa el segundo numero a multiplicar: ");
                myInt2 = scanner.nextInt();
                calculator.multiply(myInt,myInt2);
                break;
            case 4:
                System.out.println("Ingresa el primer numero a dividir: ");
                myInt = scanner.nextInt();
                System.out.println("Ingresa el segundo numero a dividir: ");
                myInt2 = scanner.nextInt();
                calculator.divide(myInt,myInt2);
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
    }
}
