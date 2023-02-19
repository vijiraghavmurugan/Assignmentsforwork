package amazon;

public class ProductWithQuantity {
	Product productObjectForCart;
	private int productsInCartQuantity;
	private double totalPriceForCart;

	public Product getProductObjectForCart() {
		return productObjectForCart;
	}

	public void setProductObjectForCart(Product productObjectForCart) {
		this.productObjectForCart = productObjectForCart;
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

	public ProductWithQuantity() {

	}
	
	public double calculateTotalPrice() {
		totalPriceForCart=productObjectForCart.getProductPrice()*productsInCartQuantity;
		return totalPriceForCart;
	}

}
