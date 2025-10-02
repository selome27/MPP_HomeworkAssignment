package lesson3.prob4;

public class Trailer extends Property{
    private double rent;

    public Trailer(Address address, double rent) {
        super(address);
        this.rent = rent;
    }

    @Override
    public double computeRent(){
        return  500 * rent;
    }
}
