package lesson5.prob1.rulesets;

import lesson5.prob1.gui.BookWindow;

import java.awt.Component;

//import lesson5.labsolns.prob1.gui.*;


/**
 * Rules:
 * 1. All fields must be nonempty
 * 2. Isbn must be numeric and consist of either 10 or 13 characters
 * 3. If Isbn has length 10, the first digit must be 0 or 1
 * 4. If Isbn has length 13, the first 3 digits must be either 978 or 979
 * 5. Price must be a floating point number with two decimal places 
 * 6. Price must be a number greater than 0.49.
 *
 */
public class BookRuleSet implements RuleSet {



	@Override
	public void applyRules(Component ob) throws RuleException {
		// TODO Auto-generated method stub
		BookWindow b = (BookWindow)ob;
		String isbn =  b.getIsbnValue().trim();
		String priceString = b.getPriceValue().trim();
        //1
		if(isbn.isEmpty() || priceString.isEmpty()){
			throw new RuleException("All fields must be nonempty");
		}
		//2
		if(!isbn.matches("\\d+")){
			throw new RuleException(" Isbn must be numeric.");
		}
		if(!(isbn.length()== 10 || isbn.length() == 13)){
			throw new RuleException("Isbn must be  consist of either 10 or 13 characters");
		}
		//3
		if(isbn.length() == 10){
			if(!(isbn.startsWith("0") || isbn.startsWith("1"))){
				throw new RuleException("If Isbn has length 10, the first digit must be 0 or 1 ");
			}
		}
		//4
		if(isbn.length() == 13){
			if(!(isbn.startsWith("978") || isbn.startsWith("979"))){
				throw new RuleException("If Isbn has length 13, the first 3 digits must be either 978 or 979 ");
			}
		}
		//5
		double price;
		try {
			price = Double.parseDouble(priceString); // numeric check
		} catch (NumberFormatException e) {
			throw new RuleException("Price must be a floating point number");
		}

		System.out.printf("Price must be with two decimal places : $%.2f\n", price);

         //6
		if (price <= 0.49) {
			throw new RuleException("Price must be a number greater than 0.49.");
		}

	}
	}


