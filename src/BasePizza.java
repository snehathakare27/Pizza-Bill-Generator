import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class BasePizza extends Pizza implements PizzaPricing{
	
	// Constructor
	public BasePizza(boolean veg) {
		setVeg(veg);
		
		if(veg) {
			setPrice(VEG_PIZZA_PRICE);
		} else {
			setPrice(NON_VEG_PIZZA_PRICE);
		}
		
		setBasePizza(getPrice());
	}
	
	public void addExtraCheese() {
		setExtraCheese(true);
		addPrice(EXTRA_CHEESE_PRICE);
	}
	
	public void addExtraToppings() {
		setExtraTopping(true);
		addPrice(EXTRA_TOPPING_PRICE);
		
	}
	
	public void takeAway() {
		setTakeAway(true);
		addPrice(PACKAGE_PRICE);
	}

	public void getBill() {
		// Decimal format IDR : Rpxx.xxx,xx
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
		System.out.printf("Pizza\t\t\t: %s %n", kursIndonesia.format(getBasePizza()));
		
		if(isExtraCheese()) {
			System.out.printf("Extra Cheese Added\t: %s %n", kursIndonesia.format(EXTRA_CHEESE_PRICE));
		}
		if(isExtraTopping()) {
			System.out.printf("Extra Topping Added\t: %s %n", kursIndonesia.format(EXTRA_TOPPING_PRICE));
		}
		if(isTakeAway()) {
			System.out.printf("Take Away Ordered\t: %s %n", kursIndonesia.format(PACKAGE_PRICE));
		}
		
		System.out.printf("Bill\t\t\t: %s %n%n", kursIndonesia.format(getPrice()));
	}
	
}
/**
 * Pizza		: Rp50.000,00
 * Cheese 		: Rp15.000,00
 * Topping		: Rp20.000,00
 * Take Away	: Rp5.000,00
 * Bill			: Rp90.000,00
 */

