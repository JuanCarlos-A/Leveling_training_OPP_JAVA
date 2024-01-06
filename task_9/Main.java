package session_3.task_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Variables
        int quest;
        int cant;
        String nameFood;
        float priceFood;

//        Instancia
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        while (true){
            System.out.println("====================================\n\t\tRestaurante El Sancocho");
            System.out.print("Estas son las opciones del restaurante:\n1. Añadir una receta al Menu.\n2. Realizar una orden\n3. Cambiar Orden\n4. Conocer la cantidad de platos en el menu.\n5. Imprimir menu\n6. Salir\nIngresa el numero de la opcion: ");
            quest= scanner.nextInt();
            if (quest==1){
                System.out.print("Ingresa la cantida de recetas que vas a agregar al menu: ");
                cant = scanner.nextInt();
                while (cant != 0){
                    System.out.print("Ingresa el nombre de la receta: ");
                    nameFood = scanner.next();
                    System.out.print("Ingresa el precio de la receta: ");
                    priceFood = scanner.nextFloat();
                    order.addRecipes(nameFood,priceFood);
                    cant--;
                }
            } else if (quest==2) {
                System.out.print("Ingresa el nombre del platillo: ");
                nameFood = scanner.next();
                System.out.print("Ingresa el precio del platillo (este tiene que ser el precio multiplicado por la cantidad de platos): ");
                priceFood = scanner.nextFloat();
                order.makeMenu(nameFood, priceFood);
            } else if (quest==3) {
                System.out.print("Ingresa el nombre del platillo a cambiar: ");
                nameFood = scanner.next();
                order.setMenu(nameFood);
            } else if (quest==4) {
                order.printAmountRecipe();
            } else if (quest==5) {
                order.printMenu();
            } else if (quest==6) {
                break;
            }else {
                System.out.println("Opcion Invalida");
            }
        }
    }
}
