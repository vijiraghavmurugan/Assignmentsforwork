package amazon;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Buyer {
	private String buyerName;
	Seller sellerViewObject = new Seller();
	static ArrayList<Buyer> buyerList = new ArrayList<Buyer>();

	Cart cartDetails = new Cart();

	public Buyer(String buyerName) {
		this.setBuyerName(buyerName);
	}

	public Buyer() {
		// TODO Auto-generated constructor stub
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public void viewAvailableProducts() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tAvailable Quantity\tSeller Name");
		for (Seller sellerObject : Seller.sellerList) {

			for (Entry<Integer, Product> viewObject : sellerObject.sellerProductObject.productList.entrySet()) {
				Product eachValue = viewObject.getValue();
				System.out.println(eachValue.getProductID() + "\t\t" + eachValue.getProductName() + "\t\t"
						+ eachValue.getProductPrice() + "\t\t" + eachValue.getAvailableQuantity() + "\t\t\t"
						+ eachValue.getSellerName());
			}
		}
	}

	public boolean addToCart(int productID, int quantityNeeded) {
		boolean addToCartFlag = false;
		for (Seller sellerObject : Seller.sellerList) {
			for (Entry<Integer, Product> productEachValue : sellerObject.sellerProductObject.productList.entrySet()) {
				if ((productEachValue.getKey() == productID)
						&& ((cartDetails.cartList.isEmpty()) || (!(cartDetails.cartList.containsKey(productID))))) {
					if (productEachValue.getValue().getAvailableQuantity() >= quantityNeeded) {
						Cart cartAdd = new Cart(productID);
						cartAdd.setProductsInCartName(productEachValue.getValue().getProductName());
						cartAdd.setProductsInCartPrice(productEachValue.getValue().getProductPrice());
						cartAdd.setProductsInCartQuantity(quantityNeeded);
						cartAdd.setTotalPriceForCart(quantityNeeded * productEachValue.getValue().getProductPrice());
						cartDetails.cartList.put(productID, cartAdd);
						addToCartFlag = true;

					} else {
						System.out.println("Enter a Quantity lesser than or equal to "
								+ productEachValue.getValue().getAvailableQuantity());
						addToCartFlag = true;
					}

				}
			}
		}

		return addToCartFlag;

	}

	public void viewCart() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tQuantity\tTotal");
		for (Entry<Integer, Cart> viewProductValue : cartDetails.cartList.entrySet()) {
			Cart eachValue = viewProductValue.getValue();
			System.out.println(eachValue.getProductsInCartID() + "\t\t" + eachValue.getProductsInCartName() + "\t\t"
					+ eachValue.getProductsInCartPrice() + "\t\t" + eachValue.getProductsInCartQuantity() + "\t\t"
					+ eachValue.getTotalPriceForCart());
		}
	}

	public boolean buyCartItems() {
		boolean buyFlag = false;
		if (!cartDetails.cartList.isEmpty()) {
			for (Seller sellerObject : Seller.sellerList) {
				for (Entry<Integer, Cart> buyProductValue : cartDetails.cartList.entrySet()) {
					int key = buyProductValue.getKey();
					if (sellerObject.sellerProductObject.productList.containsKey(key)
							&& (sellerObject.sellerProductObject.productList.get(key)
									.getAvailableQuantity() >= buyProductValue.getValue()
											.getProductsInCartQuantity())) {
						cartDetails.boughtProducts.add(buyProductValue.getValue());
						sellerObject.sellerProductObject.productList.get(key).setAvailableQuantity(
								sellerObject.sellerProductObject.productList.get(key).getAvailableQuantity()
										- buyProductValue.getValue().getProductsInCartQuantity());
						buyFlag = true;
					}
				}
			}
			cartDetails.cartList.clear();
		} else {
			System.out.println("Cart is empty");
		}
		return buyFlag;
	}

	public boolean modifyCart(int productID, int quantityNeeded) {
		boolean modifyFlag = false;
		modify: for (Seller sellerObject : Seller.sellerList) {

			for (Entry<Integer, Product> productEachValue : sellerObject.sellerProductObject.productList.entrySet()) {

				if ((productEachValue.getKey() == productID)
						&& (productEachValue.getValue().getAvailableQuantity() >= quantityNeeded)) {

					for (Entry<Integer, Cart> modifyProductValue : cartDetails.cartList.entrySet()) {

						if (modifyProductValue.getKey() == (productID)) {
							Cart cartModify = new Cart(productID);
							cartModify.setProductsInCartID(productID);
							cartModify.setProductsInCartName(modifyProductValue.getValue().getProductsInCartName());
							cartModify.setProductsInCartPrice(modifyProductValue.getValue().getProductsInCartPrice());
							cartModify.setProductsInCartQuantity(quantityNeeded);
							cartModify.setTotalPriceForCart(
									quantityNeeded * productEachValue.getValue().getProductPrice());
							modifyFlag = cartDetails.cartList.put(productID, cartModify) != null ? true : false;
						} else {
							System.out.println("Enter the quantity equal to or less than "
									+ productEachValue.getValue().getAvailableQuantity());
							continue modify;
						}
					}
				}
			}
		}

		return modifyFlag;

	}

	public boolean removeFromCart(int productID) {
		boolean removeFlag = false;
		for (Entry<Integer, Cart> removeProductValue : cartDetails.cartList.entrySet()) {
			if (removeProductValue.getKey() == (productID)) {
				removeFlag = cartDetails.cartList.remove(productID) != null ? true : false;
			}

		}
		return removeFlag;
	}

	public void viewInvoice() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tQuantity\tTotal");
		for (Cart orderValue : cartDetails.boughtProducts) {
			System.out.println(orderValue.getProductsInCartID() + "\t\t" + orderValue.getProductsInCartName() + "\t\t"
					+ orderValue.getProductsInCartPrice() + "\t\t" + orderValue.getProductsInCartQuantity() + "\t\t"
					+ orderValue.getTotalPriceForCart());
		}
	}

}
