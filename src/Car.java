public class Car extends MeansOfTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void updateTyre() {
        System.out.println("Меняем покрышку автомобиля");
    }

     public static void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
