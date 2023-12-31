package session_2.task6;
//Importaciones
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Atributos
        int quest;
//      Instancia de Metodos
        Scanner scanner = new Scanner(System.in);
        Animals cheetah = new Animals("Cheetah", 56, "Acinonyx jubatus", "Carnivoro(antelope,gazelles)", "bosques secos, matorrales, pastizales y desiertos", true);
        Animals rhinoceros = new Animals("Rhinoceros", 130, "Rhinocerotidae", "Hervivoro(grass,fruit)", "sabana, matorrales, pastizales y desiertos", true);
        Animals gorilla = new Animals("Gorila", 79, "Primates", "Hervivoro(larvae,fruit)", "bosques tropicales, montaña", true);
        Animals llama = new Animals("Llama", 23, "Lama", "Hervivoro(grass)", "altiplano, pastos", false);
        Animals crocodiles = new Animals("Cocrodilos", 2, "Crocodylidae", "Carnivoro(insects, fish)", "pantanos, estanques, humedales", true);
//      Codigo de Ejecución
        System.out.println("=====================================");
        System.out.println(" Bienvenido al Zoologico || Informacion");
        System.out.println(" ¿Quieres conocer mas información sobre los animales? El numero de la Opción. \n1. Si \n2. No\n");
        quest = scanner.nextInt();
        System.out.println("=====================================");
        if (quest == 1){
            cheetah.getInformation();
            rhinoceros.getInformation();
            gorilla.getInformation();
            llama.getInformation();
            crocodiles.getInformation();
        } else if (quest == 2) {
            System.out.println(" Esta bien, muchas gracias por visitar el Zoologico");
        }else{
            System.out.println(" Opcion Invalida");
        }


    }
}
