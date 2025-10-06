package lesson5.prob1.rulesets;



import lesson5.prob1.gui.CDWindow;

import java.awt.Component;



/**
 * Rules:
 *  1. All fields must be nonempty 
 *  2. Price must be a floating point number with two decimal places 
 *  3. Price must be a number greater than 0.49. 
 */

public class CDRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		CDWindow c = (CDWindow) ob;

		String artist = c.getArtistValue().trim();
		String title = c.getTitleValue().trim();
		String priceString = c.getPriceValue().trim();

		// 1
		if (artist.isEmpty() || title.isEmpty() || priceString.isEmpty()) {
			throw new RuleException("All fields must be nonempty ");
		}

		//2:
		double price;
		try {
			price = Double.parseDouble(priceString);
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a floating point number");
		}

		System.out.printf("Price must be with two decimal places : $%.2f%n", price);

		//3
		if (price <= 0.49) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}
		
	}
	
}
