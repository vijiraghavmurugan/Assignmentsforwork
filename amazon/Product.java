package amazon;

import java.util.HashMap;

public class Product {
	private int productID;
	private String productName;
	private double productPrice;
	private int availableQuantity;
	private String sellerName;
	HashMap<Integer, Product> productList = new HashMap<Integer, Product>();

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Product(int productID, String productName, double productPrice, int availableQuantity) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
		this.availableQuantity = availableQuantity;
	}

	public Product(int productID) {
		this.productID = productID;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
