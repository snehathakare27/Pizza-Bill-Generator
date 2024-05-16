
public abstract class Pizza {
	
	private int price;
	private int basePizza;
	private boolean veg;
	private boolean isExtraCheese;
	private boolean isExtraTopping;
	private boolean isTakeAway;
	
	public abstract void addExtraCheese();
	public abstract void addExtraToppings();
	public abstract void takeAway();
	public abstract void getBill();
	
	public void addPrice(int price) {
		this.price += price;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getBasePizza() {
		return basePizza;
	}
	public void setBasePizza(int basePizza) {
		this.basePizza = basePizza;
	}
	public boolean isVeg() {
		return veg;
	}
	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	public boolean isExtraCheese() {
		return isExtraCheese;
	}
	public void setExtraCheese(boolean isExtraCheese) {
		this.isExtraCheese = isExtraCheese;
	}
	public boolean isExtraTopping() {
		return isExtraTopping;
	}
	public void setExtraTopping(boolean isExtraTopping) {
		this.isExtraTopping = isExtraTopping;
	}
	public boolean isTakeAway() {
		return isTakeAway;
	}
	public void setTakeAway(boolean isTakeAway) {
		this.isTakeAway = isTakeAway;
	}
	
	
}
