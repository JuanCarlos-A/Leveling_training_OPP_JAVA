package session_3.task_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Variables
        int quest;
        String nameProduct;
        double priceProduct;
        int cantProduct;

//        Instancias
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);

//        Ejecución del Programa
        while (true){
            System.out.println("===========================================================================");
            System.out.println("Bienvenido al Programa de Venta en el Supermercado\nEstas son las opciones:");
            System.out.print("1.Añadir Producto nuevo (si ya existe, la cantidad de producto y precio se actualizaran)\n2.Visualizar los productos y sus precios($)\n3.Vender un Producto\n4.Salir\nIngresa el número de la opción que desees realizar:");
            quest = scanner.nextInt();
            if (quest==1){
                System.out.print("Ingresa el nombre del Producto: ");
                nameProduct = scanner.next().toUpperCase();
                System.out.print("Ingresa el precio del Producto: ");
                priceProduct = scanner.nextDouble();
                System.out.print("Ingresa la cantidad del Producto: ");
                cantProduct = scanner.nextInt();
                inventario.addProducts(nameProduct, priceProduct, cantProduct);
            } else if (quest==2) {
                System.out.println("===========================================================================");
                System.out.println("\t\tLista de Productos");
                inventario.getProducts();
            } else if (quest==3) {
                System.out.println("===========================================================================");
                System.out.print("Ingresa el nombre del Producto: ");
                nameProduct = scanner.next().toUpperCase();
                System.out.print("Ingresa la cantidad del Producto: ");
                cantProduct = scanner.nextInt();
                System.out.print("Ingresa el pago del Producto: ");
                priceProduct = scanner.nextDouble();

                inventario.sellProducts(nameProduct, cantProduct, priceProduct);
            } else if (quest==4) {
                System.out.println("Salida del Sistema, vuelva pronto");
                break;
            }else{
                System.out.println("Opcion Invalida");
            }
        }
    }
}
