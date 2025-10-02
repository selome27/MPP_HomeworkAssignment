package lesson3.prob4;

public class Driver {

	public static void main(String[] args) {

         Address houseAddress = new Address("1000 N 4th street","fairfield","Iowa", 5257);
         Address condoAddress = new Address("1000 N 4th street","fairfield","Iowa", 5257);
         Address trailerAddress = new Address("1000 N 4th street","fairfield","Iowa", 5257);

         Property[] p = { new House(houseAddress,9000, 900),
                          new Condo(condoAddress,2000,200),
                          new Trailer(trailerAddress,1500)};
         double totalRent = Admin.computeTotalRent(p);
        System.out.println("totalRent  " + totalRent);


		/*Object[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);*/
	}
}
