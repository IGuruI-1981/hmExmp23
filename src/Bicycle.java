public class Bicycle extends MeansOfTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
