package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product (1,"Laptop","HP Laptop",5000,10,"Black");
		
		
		/*Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("HP Laptop");
		product.setStockAmount(10);
		product.setPrice(5000);*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
	}

}
