package session_2.task6;

public class Animals {
//    Atributos
    public String nameAnimal;
    public int daysFree;
    public String specie;
    public String feeding;
    public String habitad;
    public boolean dangerExtinction;

//    Metodos Constructor
    public Animals(String nameAnimal, int daysFree, String specie, String feeding, String habitad, boolean dangerExtinction) {
        this.nameAnimal = nameAnimal;
        this.daysFree = daysFree;
        this.specie = specie;
        this.feeding = feeding;
        this.habitad = habitad;
        this.dangerExtinction = dangerExtinction;
    }

//    Metodos
    public void getInformation(){
        System.out.println("==========================================");
        System.out.println(" El nombre del Animal es: "+nameAnimal+".");
        System.out.println(" Pertenece a la especie: "+specie+".");
        System.out.println(" Su alimentación consiste en: "+feeding+".");
        System.out.println(" Habita en el ecosistema: "+habitad+".");
        System.out.println(" Faltan "+daysFree+"(días) para su liberación en su habitad natural.");
        if (dangerExtinction){
            System.out.println(" Se encuentra en peligro de extinción.");
        }else{
            System.out.println(" No se encuentra en vía de extención.");
        }
    }
}
