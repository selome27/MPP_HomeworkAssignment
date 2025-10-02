package lesson3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> b;

    public LandlordInfo() {
        b = new ArrayList<>();
    }

    public List<Building> getB() {
        return b;
    }

    public void addBuilding(Building build) {
        b.add(build);
    }

    public double calcProfits() {
        double Totalsum = 0.0;
        for (Building bu : b) {
            Totalsum += bu.calcTotalProfits();

        }
        return Totalsum;
    }
}
