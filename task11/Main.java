package session_4.task11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de productos (BankProduct) para usarla al crear cliente
        List<BankProduct> productList = new ArrayList<>();

        // Crear cliente por defecto
        Client client = new Client(1, "Oscar", 123456789, productList);

        int op;
        do{
            System.out.println("Banco Menú");
            System.out.println("Operaciones del cliente");
            System.out.println("(1) Mostrar información personal");
            System.out.println("(2) Modificar información personal");
            System.out.println("(3) Mostrar productos del cliente");
            System.out.println("(4) Modificar cuenta");
            System.out.println("(0) Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    client.showPersonalInfo();
                    break;
                case 2:
                    client.modifyPersonalInfo();
                    break;
                case 3:
                    client.showProducts();
                    break;
                case 4:
                    client.modifyAccount();
                    break;
            }
        }while(op!=0);

        sc.close();
    }
}