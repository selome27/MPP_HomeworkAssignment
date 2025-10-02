package lesson3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Apartment> apt;
    private int mCost;


    public Building(int mcost ) {
        this.mCost = mcost;
        apt = new ArrayList<>();
    }
    public void addApartment(Apartment apartment){
        apt.add(apartment);
    }

    public double calcTotalProfits() {
        double Totalsum = 0.0;
        for (Apartment a : apt) {
            Totalsum += a.getRent();

        }
         return  Totalsum - mCost;

    }
}