package lesson3.prob4;

public class Condo extends Property{
    private double rent;
    private  int numFloors;

    public Condo(Address address, double rent, int numFloors) {
        super(address);
        this.rent = rent;
        this.numFloors = numFloors;
    }

    @Override
    public double computeRent(){
        return 400 * numFloors;
    }
}
