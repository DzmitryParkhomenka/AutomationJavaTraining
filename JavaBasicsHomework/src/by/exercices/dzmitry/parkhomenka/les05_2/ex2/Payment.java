package by.exercices.dzmitry.parkhomenka.les05_2.ex2;

public class Payment {

	public static void main(String[] args) {
		ProductList purchaseBill = new ProductList();
		purchaseBill.addPurchaseToBill(new Product("Java Book", 90));
		purchaseBill.addPurchaseToBill(new Product("Clean Code Book", 30));
		purchaseBill.addPurchaseToBill(new Product("Algorythms and Data Structure Book", 50));
		PaymentFunctions paymentProcess = new PaymentFunctions();
		int totalPriceOfPurchases = paymentProcess.countTotalPurchasePrice(purchaseBill.getNumberOfPurchases());
		paymentProcess.showTotalPriceToConsole(totalPriceOfPurchases);
	}
}
