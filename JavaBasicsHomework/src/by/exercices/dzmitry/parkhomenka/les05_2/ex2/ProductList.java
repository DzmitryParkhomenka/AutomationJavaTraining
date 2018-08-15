package by.exercices.dzmitry.parkhomenka.les05_2.ex2;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	private ArrayList<Product> numberOfPurchases = new ArrayList<Product>();
	
	public ProductList() {
	}
		
	public List<Product> getNumberOfPurchases(){
		return numberOfPurchases;
	}
	
	public void addPurchaseToBill(Product product) {
		numberOfPurchases.add(product);
	}
	
	public boolean deletePurchaseFromBill(Product product) {
		return numberOfPurchases.remove(product);
	}
	
}
