package spcls;

public class Customer {
    
    private String customer_id;
    private String customer_name;
    private String mobile;
    private Product product;

    public Customer(String customer_id, String customer_name, String mobile, Product product) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.mobile = mobile;
        this.product = product;
    }
    
    public void showDetails() {
        
        System.out.println("Customer ID : " + customer_id);
        System.out.println("Customer Name : " + customer_name);
        System.out.println("Mobile : " + mobile);
        product.displayProduct();
    }
}
