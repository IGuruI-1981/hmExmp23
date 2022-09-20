public class Truck extends MeansOfTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем покрышку грузовика " + getModelName());
        }
    }

    public void checkEngine() {
        System.out.println("Ремонтируем двигатель  грузовика " + getModelName());
    }

    public void checkTrailer() {
        System.out.println("Ремонтируем трейлер "+ getModelName());
    }

    @Override
    public void transportService() {
        updateTyre();
        checkEngine();
        checkTrailer();
        System.out.println(" ");
    }

}
