package pizzaPack;

public class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded=false;
	private boolean isExtraToppingAdded=false;
	private boolean isOptedTakeAway=false;

	public Pizza(Boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice=this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded=true;
		this.price += extraCheesePrice;
	}

	public void addExtraTopping() {
		isExtraToppingAdded=true;
		this.price += extraToppingPrice;
	}

	public void takeAway() {
		isOptedTakeAway=true;
		this.price += backPackPrice;
	}

	public void getBill() {
		String bill="";
		System.out.println("Pizza : "+basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill+="Extra Cheese added: "+extraCheesePrice+"\n";
		}
		if(isExtraToppingAdded) {
			bill+="Extra Topping added: "+extraToppingPrice+"\n";
		}
		if(isOptedTakeAway) {
			bill+="Take Away: "+backPackPrice+"\n";
		}
		bill+="Total Bill: "+this.price+"\n";
		System.out.println(bill);
	}
}
