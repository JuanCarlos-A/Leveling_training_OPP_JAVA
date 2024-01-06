package session_3.task_9;
//Importaciones
import java.util.ArrayList;

public class Recipe {
//    Atributos
    private ArrayList<String> recipeNames = new ArrayList<>();
    private ArrayList<Float> recipePrices = new ArrayList<>();
    private String recipeName;
    private float recipePrice;

//    Constructor
    public Recipe() {}

//    Metodos

    public void addRecipes(){
        this.recipeNames.add(this.recipeName);
        this.recipePrices.add(this.recipePrice);
    }

    public ArrayList<String> getRecipeNames() {
        return recipeNames;
    }

    public ArrayList<Float> getRecipePrices() {
        return recipePrices;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipePrice(float recipePrice) {
        this.recipePrice = recipePrice;
    }
}
