public class Truck extends MeansOfTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    public static void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
