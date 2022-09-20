public class Bicycle extends MeansOfTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void updateTyre() {
        for (int i=0; i< getWheelsCount();i++){
            System.out.println("Меняем покрышку велосипеда " + getModelName());
        }
    }

    @Override
   public void transportService() {
        updateTyre();
        System.out.println(" ");
    }

}
