package spcls;

public class Product {
    
    private String product_id;
    private String product_name;
    private int qty;
    private int price;

    public Product(String product_id, String product_name, int qty, int price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.qty = qty;
        this.price = price;
    }
    
    public void displayProduct() {
        
        System.out.println("Product ID : " + product_id);
        System.out.println("Product Name : " + product_name);
        System.out.println("Quantity : " + qty);
        System.out.println("Price : " + price);
    }
}
