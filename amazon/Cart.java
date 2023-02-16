package amazon;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
	private int productsInCartID;
	private String productsInCartName;
	private double productsInCartPrice;
	private int productsInCartQuantity;
	private double totalPriceForCart;
	HashMap<Integer, Cart> cartList = new HashMap<Integer, Cart>();
	ArrayList<Cart> boughtProducts = new ArrayList<Cart>();

	public Cart() {

	}

	public Cart(String productsInCartName, double productsInCartPrice, int productsInCartQuantity) {

		this.setProductsInCartName(productsInCartName);
		this.setProductsInCartPrice(productsInCartPrice);
		this.setProductsInCartQuantity(productsInCartQuantity);
	}

	public Cart(int productsInCartID) {
		this.productsInCartID = productsInCartID;
	}

	public int getProductsInCartID() {
		return productsInCartID;
	}

	public void setProductsInCartID(int productsICartID) {
		this.productsInCartID = productsICartID;
	}

	public String getProductsInCartName() {
		return productsInCartName;
	}

	public void setProductsInCartName(String productsInCartName) {
		this.productsInCartName = productsInCartName;
	}

	public double getProductsInCartPrice() {
		return productsInCartPrice;
	}

	public void setProductsInCartPrice(double productsInCartPrice) {
		this.productsInCartPrice = productsInCartPrice;
	}

	public int getProductsInCartQuantity() {
		return productsInCartQuantity;
	}

	public void setProductsInCartQuantity(int productsInCartQuantity) {
		this.productsInCartQuantity = productsInCartQuantity;
	}

	public double getTotalPriceForCart() {
		return totalPriceForCart;
	}

	public void setTotalPriceForCart(double totalPriceForCart) {
		this.totalPriceForCart = totalPriceForCart;
	}

}
