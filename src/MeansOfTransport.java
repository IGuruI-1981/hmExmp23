public class MeansOfTransport {

    private String modelName;
    private int wheelsCount;

    public MeansOfTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

  public static void transportService(){
      Bicycle.updateTyre();
      Car.updateTyre();
      Car.checkEngine();
      Truck.updateTyre();
      Truck.checkEngine();
      Truck.checkTrailer();

  }
    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
