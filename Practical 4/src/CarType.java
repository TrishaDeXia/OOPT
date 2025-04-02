public class CarType {
    private String make;
    private String model;
    private Double capacity;

    
    public CarType(String make, String model, Double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public String toString() {
        return String.format("%-10s %-10s %5.1f", make + " " + model + " " + capacity);
    }

}
