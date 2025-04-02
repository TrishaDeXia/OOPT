public class CarRegister {
    private int regNo;
    private Owner owner;
    private Car car;
    private static int nextRegNo = 1001;

    public CarRegister(Owner owner, Car car) {
        this.owner = owner;
        this.car = car;
        regNo = nextRegNo++;
    }

    public static int getNextRegNo() {
        return nextRegNo;
    }

    public String toString() {
        return String.format("%-6d %-24s %-39s\n", regNo, owner, car);
    }
}
