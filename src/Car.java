public class Car extends MeansOfTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку автомобиля " + getModelName());
        }
    }

    public void checkEngine() {
        System.out.println("Ремонтируем двигатель  авто " + getModelName());
    }

    @Override
   public void transportService() {
        updateTyre();
        checkEngine();
        System.out.println(" ");
    }

}
