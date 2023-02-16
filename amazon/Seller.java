package amazon;

import java.util.ArrayList;
import java.util.Map.Entry;

public class Seller {
	private String sellerName;
	Product sellerProductObject = new Product();
	static ArrayList<Seller> sellerList = new ArrayList<Seller>();

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Seller() {

	}

	public Seller(String sellerName) {
		this.sellerName = sellerName;
	}

	public boolean addProduct(int productID, String productName, double productPrice, int availableQuantity) {
		boolean addFlag = false;

		if (!sellerProductObject.productList.containsKey(productID)) {
			Product sellerProductAdd = new Product(productID, productName, productPrice, availableQuantity);
			sellerProductAdd.setSellerName(sellerName);
			addFlag = sellerProductObject.productList.put(productID, sellerProductAdd) != null ? true : false;
		} else {
			System.out.println("Enter unique product name");
			addFlag = true;
		}
		return addFlag;

	}

	public boolean removeProduct(int productID) {
		viewProduct();
		boolean removeFlag = false;
		removeFlag = sellerProductObject.productList.remove(productID) != null ? true : false;

		return removeFlag;
	}

	public void viewProduct() {
		System.out.println("Product ID\tProduct Name\tProductPrice\tAvailable Quantity\tSeller Name");
		for (Entry<Integer, Product> eachProductValue : sellerProductObject.productList.entrySet()) {
			Product eachValue = eachProductValue.getValue();
			System.out.println(eachValue.getProductID() + "\t\t" + eachValue.getProductName() + "\t\t"
					+ eachValue.getProductPrice() + "\t\t" + eachValue.getAvailableQuantity() + "\t\t\t"
					+ eachValue.getSellerName());
		}

	}

	public boolean modifyProduct(int productID, double productPrice, int availableQuantity) {
		boolean modifyFlag = false;
		for (Entry<Integer, Product> eachProductValue : sellerProductObject.productList.entrySet()) {
			if (eachProductValue.getKey() == productID) {
				Product productModifyAvailableQuantity = new Product(productID);
				productModifyAvailableQuantity.setProductID(eachProductValue.getValue().getProductID());
				productModifyAvailableQuantity.setProductName(eachProductValue.getValue().getProductName());
				productModifyAvailableQuantity.setSellerName(eachProductValue.getValue().getSellerName());
				if (productPrice == 0.0) {
					productModifyAvailableQuantity.setProductPrice(eachProductValue.getValue().getProductPrice());
					productModifyAvailableQuantity.setAvailableQuantity(availableQuantity);

				} else if (availableQuantity == 0) {
					productModifyAvailableQuantity.setProductPrice(productPrice);
					productModifyAvailableQuantity
							.setAvailableQuantity(eachProductValue.getValue().getAvailableQuantity());

				}
				modifyFlag = sellerProductObject.productList.replace(productID, productModifyAvailableQuantity) != null
						? true
						: false;
			} else {
				System.out.println("Enter a valid Product Name");
				modifyFlag = true;
			}
		}
		return modifyFlag;

	}

}
