package amazon;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Buyer {
	private String buyerName;
	Seller sellerViewObject = new Seller();

	ArrayList<ProductWithQuantity> cart = new ArrayList<ProductWithQuantity>();
	ArrayList<ProductWithQuantity> boughtProducts = new ArrayList<ProductWithQuantity>();

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public Buyer() {
		// TODO Auto-generated constructor stub
	}

	public Buyer(String buyerName) {
		this.setBuyerName(buyerName);
	}

	public void viewAvailableProducts() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tAvailable Quantity");
		for (Seller sellerObject : Main.sellerList) {
			for (Entry<Product, Integer> eachValue : sellerObject.sellerProductList.entrySet()) {
				System.out.println(eachValue.getKey().getProductID() + "\t\t" + eachValue.getKey().getProductName()
						+ "\t\t" + eachValue.getKey().getProductPrice() + "\t\t" + eachValue.getValue());
			}
		}
	}

	public boolean addToCart(int productID, int quantityNeeded) {
		boolean addToCartFlag = false;
		boolean flagForAdd = true;

		for (ProductWithQuantity eachValue : cart) {
			if (eachValue.getProductObjectForCart().getProductID() == productID) {
				flagForAdd = false;
			}
		}
		if (cart.isEmpty() || (flagForAdd)) {

			for (Seller sellerObject : Main.sellerList) {
				for (Entry<Product, Integer> eachProductValue : sellerObject.sellerProductList.entrySet()) {
					if (eachProductValue.getKey().getProductID() == productID) {
						if (eachProductValue.getValue() >= quantityNeeded) {
							ProductWithQuantity cartAdd = new ProductWithQuantity();
							cartAdd.setProductObjectForCart(eachProductValue.getKey());
							cartAdd.setProductsInCartQuantity(quantityNeeded);
							cartAdd.setTotalPriceForCart(quantityNeeded * eachProductValue.getKey().getProductPrice());
							cart.add(cartAdd);
							addToCartFlag = true;
						} else {
							System.out
									.println("Enter a Quantity lesser than or equal to " + eachProductValue.getValue());
							addToCartFlag = true;
						}
					}
				}
			}
		}
		return addToCartFlag;
	}

	public void viewCart() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tQuantity\tTotal");
		for (ProductWithQuantity viewProductValue : cart) {
			System.out.println(viewProductValue.productObjectForCart.getProductID() + "\t\t"
					+ viewProductValue.productObjectForCart.getProductName() + "\t\t"
					+ viewProductValue.productObjectForCart.getProductPrice() + "\t\t"
					+ viewProductValue.getProductsInCartQuantity() + "\t\t" + viewProductValue.getTotalPriceForCart());
		}
	}

	public boolean buyCartItems() {
		boolean buyFlag = false;
		if (!cart.isEmpty()) {
			boughtProducts.addAll(cart);
			buyFlag = true;
			cart.removeAll(boughtProducts);
		} else {
			System.out.println("Cart is empty");
		}
		return buyFlag;
	}

	public boolean modifyCart(int productID, int quantityNeeded) {
		boolean modifyFlag = false;
		int index = 0;
		Product productValueForModify = new Product(productID);

		for (ProductWithQuantity cartValues : cart) {
			if (cartValues.getProductObjectForCart().getProductID() != productID) {
				System.out.println("Entered Product Id is not in the Product list");
				return modifyFlag;
			} else {

				index = cart.indexOf(cartValues);
			}
		}
		for (Seller sellerObject : Main.sellerList) {
			for (Entry<Product, Integer> productEachValue : sellerObject.sellerProductList.entrySet()) {
				if (productEachValue.getKey().equals(productValueForModify)) {
					if (sellerObject.getAvailableQuantity() >= quantityNeeded) {
						ProductWithQuantity cartDetails = new ProductWithQuantity();
						cartDetails.setProductObjectForCart(productEachValue.getKey());
						cartDetails.setProductsInCartQuantity(quantityNeeded);
						cartDetails.setTotalPriceForCart(cartDetails.calculateTotalPrice());
						modifyFlag = cart.set(index, cartDetails) != null ? true : false;
					} else {
						System.out.println("Enter the quantity less than the available quantity");
					}
				}
			}
		}

		return modifyFlag;

	}

	public boolean removeFromCart(int productID) {
		boolean removeFlag = false;

		for (ProductWithQuantity orderValue : boughtProducts) {
			if (orderValue.getProductObjectForCart().getProductID() == productID) {
				removeFlag = cart.remove(productID) != null ? true : false;
			}

		}
		return removeFlag;
	}

	public void viewInvoice() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tQuantity\tTotal");
		for (ProductWithQuantity orderValue : boughtProducts) {
			System.out.println(orderValue.productObjectForCart.getProductID() + "\t\t"
					+ orderValue.productObjectForCart.getProductName() + "\t\t"
					+ orderValue.productObjectForCart.getProductPrice() + "\t\t"
					+ orderValue.getProductsInCartQuantity() + "\t\t" + orderValue.getTotalPriceForCart());
		}
	}

}
