public abstract class MeansOfTransport {

    private String modelName;
    private int wheelsCount;

    public MeansOfTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


     public abstract void transportService();


    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

   }
