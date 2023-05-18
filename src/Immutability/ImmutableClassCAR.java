package Immutability;

public final class ImmutableClassCAR {
    private final String brand;
    private final String model;
    private final String engine;
    private final String carClass;

    ImmutableClassCAR(String brand, String model, String engine, String carClass){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.carClass =carClass;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getCarClass() {
        return carClass;
    }
}
