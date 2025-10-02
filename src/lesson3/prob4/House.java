package lesson3.prob4;

public class House extends Property{
    private double rent;
    private double lotSize;

    public House(Address address, double rent, double lotSize) {
        super(address);
        this.rent = rent;
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 *rent;
    }
}
