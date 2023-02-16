package amazon;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static String sellerOrBuyer = null;
	static boolean flag = true;

	static int productID = 0;
	static String productName;
	static double productPrice;
	static int availableQuantity;
	static int quantityNeeded;

	static Seller sellerObject = new Seller();
	static Buyer buyerObject = new Buyer();

	public static void main(String[] args) {

		Seller sellerOne = new Seller("sellerone");
		Seller sellerTwo = new Seller("sellertwo");
		Seller sellerThree = new Seller("sellerthree");
		Seller.sellerList.add(sellerOne);
		Seller.sellerList.add(sellerTwo);
		Seller.sellerList.add(sellerThree);

		Buyer buyerOne = new Buyer("buyerone");
		Buyer buyerTwo = new Buyer("buyertwo");
		Buyer buyerThree = new Buyer("buyerthree");
		Buyer.buyerList.add(buyerOne);
		Buyer.buyerList.add(buyerTwo);
		Buyer.buyerList.add(buyerThree);
		logIn(flag);

	}

	public static void logIn(boolean flag) {

		while (flag) {
			flag = false;
			System.out.println("Enter \"S\" for Seller or \"B\" for Buyer");
			sellerOrBuyer = scan.next();
			if (sellerOrBuyer.equalsIgnoreCase("s")) {

				System.out.println("Enter the Seller Name : ");
				String sellerName = scan.next();
				for (Seller sellerEachValue : Seller.sellerList) {
					if (sellerEachValue.getSellerName().equalsIgnoreCase(sellerName)) {
						sellerAction(sellerEachValue);
						flag = true;
					}
				}
			} else if (sellerOrBuyer.equalsIgnoreCase("b")) {
				System.out.println("Enter the Buyer Name : ");
				String buyerName = scan.next().toLowerCase();
				for (Buyer buyerEachValue : Buyer.buyerList) {
					if (buyerEachValue.getBuyerName().equalsIgnoreCase(buyerName)) {
						buyerAction(buyerEachValue);
						flag = true;
					}
				}
			}

		}

	}

	public static void sellerAction(Seller sellerName) {

		boolean sellerFlag = false;
		int choiceForUpdate = 0;
		System.out.println("\nEnter the seller action to be performed");
		System.out.println("Enter \"Add\" to Add product");
		System.out.println("Enter \"Remove\" to Remove product");
		System.out.println("Enter \"View\" to View product");
		System.out.println("Enter \"Modify\" to Modify the quantity of the product");
		System.out.println("Enter \"Back\" to return to the main menu");
		String sellerActionInput = scan.next().toLowerCase();

		switch (sellerActionInput) {

		case "add":
			System.out.println("Adding a Product");
			productID = productID + 1;
			System.out.println("Enter the Product Name");
			productName = scan.next();
			System.out.println("Enter the Product Price");
			productPrice = scan.nextDouble();
			System.out.println("Enter the Product stock quantity");
			availableQuantity = scan.nextInt();
			sellerFlag = sellerName.addProduct(productID, productName, productPrice, availableQuantity);
			System.out.println(sellerFlag ? "\nProduct added" : "\nProduct not added");
			sellerName.viewProduct();
			sellerAction(sellerName);
			break;

		case "remove":
			System.out.println("Removing a Product");
			System.out.println("Enter the Product ID");
			productID = scan.nextInt();
			sellerFlag = sellerName.removeProduct(productID);
			System.out.println(sellerFlag ? "\nProduct removed" : "\nProduct not removed");
			sellerName.viewProduct();
			sellerAction(sellerName);
			break;

		case "view":
			System.out.println("Viewing the product");
			sellerName.viewProduct();
			sellerFlag = true;
			sellerAction(sellerName);
			break;

		case "modify":
			sellerName.viewProduct();
			System.out.println("Modifying the Product");
			System.out.println("Enter the Product ID");
			productID = scan.nextInt();
			System.out.println("Enter 1 to update the Quantity or 2 to update the price of the product");
			choiceForUpdate = scan.nextInt();
			if (choiceForUpdate == 1) {
				System.out.println("Enter the quantity to be modified");
				availableQuantity = scan.nextInt();
				productPrice = 0.0;
			} else {
				System.out.println("Enter the price to be modified");
				productPrice = scan.nextDouble();
				availableQuantity = 0;
			}
			sellerFlag = sellerName.modifyProduct(productID, productPrice, availableQuantity);
			sellerName.viewProduct();
			sellerAction(sellerName);
			break;

		case "back":
			sellerFlag = true;

		}
		logIn(sellerFlag);
	}

	private static boolean buyerAction(Buyer buyerName) {
		boolean buyerFlag = false;
		System.out.println("\nEnter the Buyer action to be performed");
		System.out.println("Enter \"View\" to View all the available products");
		System.out.println("Enter \"Add\" to add a product to the cart");
		System.out.println("Enter \"Cart\" to View the cart");
		System.out.println("Enter \"Modify\" to Modify the quantities of an product in the cart");
		System.out.println("Enter \"Buy\" to buy the products added in the cart");
		System.out.println("Enter \"Bill\" to view the order invoice page");
		System.out.println("Enter \"Remove\" to remove a product from the cart");
		System.out.println("Enter \"Back\" to return to the main menu");
		String buyerActionInput = scan.next().toLowerCase();
		switch (buyerActionInput) {
		case "view":
			System.out.println("Displaying the Available Products");
			buyerName.viewAvailableProducts();
			buyerFlag = true;
			buyerAction(buyerName);
			break;
		case "add":
			buyerName.viewAvailableProducts();
			System.out.println("To add to the cart");
			System.out.println("Enter the Product ID");
			productID = scan.nextInt();
			System.out.println("Enter the quantity needed");
			quantityNeeded = scan.nextInt();
			buyerFlag = buyerName.addToCart(productID, quantityNeeded);
			System.out.println(buyerFlag ? "\nProduct Added to the cart" : "\nProduct not Added to the cart");
			buyerAction(buyerName);
			break;
		case "cart":
			System.out.println("Cart Items");
			buyerName.viewCart();
			buyerFlag = true;
			buyerAction(buyerName);
			break;
		case "modify":
			buyerName.viewCart();
			System.out.println("Modify the Cart items");
			System.out.println("Enter the Product ID");
			productID = scan.nextInt();
			System.out.println("Enter the quantity to be modified");
			quantityNeeded = scan.nextInt();
			buyerFlag = buyerName.modifyCart(productID, quantityNeeded);
			System.out.println(buyerFlag ? "\nProduct modified" : "\nProduct not modified");
			buyerName.viewCart();
			buyerAction(buyerName);
			break;
		case "remove":
			System.out.println("Enter the product id to be removed");
			productID = scan.nextInt();
			buyerFlag = buyerName.removeFromCart(productID);
			System.out.println(buyerFlag ? "\nProduct removed" : "\nProduct not removed");
			buyerAction(buyerName);
			break;
		case "buy":
			buyerName.viewCart();
			buyerFlag = buyerName.buyCartItems();
			System.out.println(buyerFlag ? "\nOrder Placed" : "\nOrder not placed");
			buyerAction(buyerName);
			break;
		case "bill":
			buyerName.viewInvoice();
			buyerFlag = true;
			break;
		case "back":
			buyerFlag = true;
		}
		return buyerFlag;
	}
}
