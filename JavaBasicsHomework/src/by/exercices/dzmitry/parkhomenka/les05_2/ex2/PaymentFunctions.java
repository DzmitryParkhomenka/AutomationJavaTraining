package by.exercices.dzmitry.parkhomenka.les05_2.ex2;

import java.util.List;

public class PaymentFunctions {
	public int countTotalPurchasePrice(List<Product> numberOfPurchases) {
		int totalPriceOfPurchases = 0;
		for (Product purchases : numberOfPurchases) {
			totalPriceOfPurchases = totalPriceOfPurchases + purchases.getProductPrice();
		}
		return totalPriceOfPurchases;
	}
	
	public void showTotalPriceToConsole(int totalPriceOfPurchases) {
		System.out.println(totalPriceOfPurchases);
	}
}
