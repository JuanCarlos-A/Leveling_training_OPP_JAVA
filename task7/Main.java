package session_2.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventory = new Inventario();

        while (true) {
            System.out.println("1. Añadir Producto\n2. Listar precios de venta\n3. Vender Producto\n4. Salir");
            System.out.print("Ingresa tu eleccion: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ingresa el nombre de tu producto: ");
                    String name = scanner.next();
                    System.out.print("Ingresa el coste del producto: ");
                    double costPrice = scanner.nextDouble();
                    System.out.print("Ingresa el precio del producto: ");
                    double sellingPrice = scanner.nextDouble();
                    System.out.print("Ingresa la cantidad: ");
                    int quantity = scanner.nextInt();

                    Producto newProduct = new Producto(name, costPrice, sellingPrice, quantity);
                    inventory.addProduct(newProduct);
                    break;

                case 2:
                    inventory.listSellingPrices();
                    break;

                case 3:
                    System.out.print("Ingresa cantidad a vender: ");
                    int quantitySold = scanner.nextInt();
                    inventory.sellProduct(quantitySold);
                    break;

                case 4:
                    System.out.println("Salida de la aplicacion. Gracias!");
                    System.exit(0);

                default:
                    System.out.println("Eleccion Invalida. Ingresa una opcion valida.");
            }
        }
    }
}
