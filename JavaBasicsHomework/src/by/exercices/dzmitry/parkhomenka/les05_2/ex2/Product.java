package by.exercices.dzmitry.parkhomenka.les05_2.ex2;

public class Product {
	private String productName;
	private int productPrice;

	public Product(String productName, int productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductPrice() {
		return productPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice + "]";
	}

}
