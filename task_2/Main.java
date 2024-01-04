package session_1.task_2;

public class Main {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("HFP154", (byte) 2, true, "Negro", false, 5000000.0d);
        Bike bike = new Bike("GHV675", (byte) 2, false, "Amarillo", true, 1400000.0d);
        Car car = new Car("GJH295", (byte) 4, (short) 5, "Rojo", true, 25600000.0d);
        LuxuryCar luxuryCar = new LuxuryCar("PLE073", (byte) 4, (short) 9, "Azul", true, 40000000.0d);
        Motorcycle motorcycle = new Motorcycle("NDF683", (byte) 4, (short) 15, "Gris", true, 9400000.0d);

        mountainBike.getInformation();
        bike.getInformation();
        car.getInformation();
        luxuryCar.getInformation();
        motorcycle.getInformation();

    }
}