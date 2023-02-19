package amazon;

import java.util.HashMap;
import java.util.Map.Entry;

public class Seller {
	private String sellerName;
	private int availableQuantity;
	Product productObjectForSeller = new Product();
	HashMap<Product, Integer> sellerProductList = new HashMap<Product, Integer>();

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public Seller() {

	}

	public Seller(String sellerName) {
		this.sellerName = sellerName;
	}

	public boolean addProduct(int productID, String productName, double productPrice, int availableQuantity) {
		boolean addFlag = false;
		Product sellerProductAdd = new Product(productID, productName, productPrice);
		this.availableQuantity = availableQuantity;

		if (!(sellerProductList.containsKey(sellerProductAdd))) {
			addFlag = sellerProductList.put(sellerProductAdd, availableQuantity) == null ? true : false;
		} else {
			System.out.println("Enter unique product name");
			addProduct(productID, productName, productPrice, availableQuantity);
		}

		return addFlag;

	}

	public boolean removeProduct(int productID) {
		viewProduct();
		boolean removeFlag = false;
		for (Entry<Product, Integer> eachValue : sellerProductList.entrySet()) {
			if (eachValue.getKey().getProductID() == productID) {
				removeFlag = sellerProductList.remove(eachValue.getKey()) != null ? true : false;
			}
		}

		return removeFlag;
	}

	public void viewProduct() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tAvailable Quantity");
		for (Entry<Product, Integer> eachValue : sellerProductList.entrySet()) {
			System.out.println(eachValue.getKey().getProductID() + "\t\t" + eachValue.getKey().getProductName() + "\t\t"
					+ eachValue.getKey().getProductPrice() + "\t\t" + eachValue.getValue());
		}

	}

	public boolean modifyProduct(int productID, double productPrice, int availableQuantity) {
		boolean modifyFlag = false;
		boolean isValidProductName = false;

		Product productValueForModify = new Product(productID);

		for (Entry<Product, Integer> eachValue : sellerProductList.entrySet()) {
			if (eachValue.getKey().equals(productValueForModify)) {
				Product productModifyAvailablePriceQuantity = new Product(productID);
				productModifyAvailablePriceQuantity.setProductID(eachValue.getKey().getProductID());
				productModifyAvailablePriceQuantity.setProductName(eachValue.getKey().getProductName());

				if (productPrice == 0.0) {
					productModifyAvailablePriceQuantity.setProductPrice(eachValue.getKey().getProductPrice());
					this.availableQuantity = availableQuantity;

				} else if (availableQuantity == 0) {
					productModifyAvailablePriceQuantity.setProductPrice(productPrice);
					this.availableQuantity = eachValue.getValue();
				}
				modifyFlag = sellerProductList.put(productModifyAvailablePriceQuantity, this.availableQuantity) != null
						? true
						: false;
				sellerProductList.remove(eachValue.getKey(), eachValue.getValue());
				isValidProductName = true;

			}
		}
		if (!isValidProductName) {
			System.out.println("Enter a valid Product Name");
			modifyProduct(productID, productPrice, availableQuantity);
		}
		return modifyFlag;

	}

}
