
public class Main {

	public static void main(String[] args) {

		BasePizza basePizza = new BasePizza(false);
		System.out.println("Normal Pizza");
		basePizza.takeAway();
		basePizza.getBill();
		
		Pizza basePizza2 = new BasePizza(true);
		System.out.println("Normal Pizza 2");
		basePizza2.addExtraCheese();
		basePizza2.addExtraToppings();
		basePizza2.getBill();
		
		DeluxPizza delux = new DeluxPizza(true);
		System.out.println("Delux Pizza");
		delux.takeAway();
		delux.getBill();
		
		Pizza deluxPizza = new DeluxPizza(true);
		System.out.println("Delux Pizza 2");
		deluxPizza.getBill();
	}

}
