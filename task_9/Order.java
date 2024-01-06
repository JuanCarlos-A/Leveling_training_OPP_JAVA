package session_3.task_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    //    Atributos
    private ArrayList<String> menuNames = new ArrayList<>();
    private ArrayList<Float> menuPrices = new ArrayList<>();

    //    Instancias
    private Recipe recipe = new Recipe();
    Scanner scanner = new Scanner(System.in);

    //    Contructor
    public Order() {}

    //    Metodos
    public void addRecipes(String recipeName, float recipePrice){
        ArrayList<String> orderNames = recipe.getRecipeNames();
        ArrayList<Float> orderPrices = recipe.getRecipePrices();

        for (int i = 0; i < orderNames.size(); i++){
            if (recipeName.equalsIgnoreCase(orderNames.get(i))){
                System.out.println("La receta "+recipeName+" ya existia, así que solo se actualizara el precio.");
                orderPrices.set(i, recipePrice);
                return;
            }
        }
        recipe.setRecipeName(recipeName);
        recipe.setRecipePrice(recipePrice);
        System.out.println("La receta fue agregada correctamente.");
        recipe.addRecipes();
    }


public void makeMenu(String menuName, float menuPrice){
    boolean verifi = true;
    boolean verifiOrder = true;
    ArrayList<String> orderNames = recipe.getRecipeNames();
    for (int j = 0; j < orderNames.size();j++){
        if (menuName.equals(orderNames.get(j))){
            for (int i = 0; i < menuNames.size(); i++){
                if (menuName.equalsIgnoreCase(menuNames.get(i))){
                    menuPrices.set(i, menuPrice);
                    System.out.println("El menu fue actualizado, la cantidad de platos es actualizado.");
                    verifi = false;
                    break;
                }

            }
            if (verifi){
                menuNames.add(menuName);
                menuPrices.add(menuPrice);
                System.out.println("Orden recibida");
            }
            verifiOrder = false;
            break;
        }
    }

    if (verifiOrder){
        System.out.println("No exite el plato en el menu.");
    }

}

public void setMenu(String menuName){
    boolean verifi = true;
    if (menuNames.isEmpty()){
        System.out.println("No hay ordenes creadas");
    }else{
        for (int i = 0; i < menuNames.size(); i++){
            if (menuName.equalsIgnoreCase(menuNames.get(i))){
                float menuPrice;
                System.out.print("Ingresa el nombre del platillo: ");
                menuName = scanner.next();
                System.out.print("Ingresa el precio del platillo: ");
                menuPrice = scanner.nextFloat();

                menuNames.set(i, menuName);
                menuPrices.set(i, menuPrice);
                System.out.println("El platillo fue actualizado.");
                verifi = false;
                break;
            }
        }
        if (verifi){
            System.out.println("El platillo no se encuntra en la orden");
        }
    }
}

public void printAmountRecipe(){
    ArrayList<String> orderNames = recipe.getRecipeNames();
    System.out.println("La cantidad de platos en el menu es "+orderNames.size());
}

public void printMenu(){
    ArrayList<String> orderNames = recipe.getRecipeNames();
    ArrayList<Float> orderPrices = recipe.getRecipePrices();

    for (int i = 0; i < orderPrices.size(); i++){
        System.out.println("=========================================\n\t\tMenu");
        System.out.println(" Plato N"+(i+1)+"\nNombre: "+orderNames.get(i)+"\nPrecio: "+orderPrices.get(i));
    }

}
}

