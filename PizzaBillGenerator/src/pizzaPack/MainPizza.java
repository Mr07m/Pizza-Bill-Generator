package pizzaPack;

public class MainPizza {
	public static void main(String[] args) {
		DeluxPizza dp= new DeluxPizza(true);
		dp.addExtraCheese();
		dp.addExtraTopping();
		dp.getBill();
	}
}
