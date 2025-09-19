class Product {
    static double discount = 10; // shared discount %

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    Product(int productID, String productName, double price, int quantity){
        this.productID = productID; // final variable
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product: " + productName + ", Price: " + price + ", Qty: " + quantity + ", ID: " + productID);
        }
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product p1 = new Product(501, "Laptop", 55000, 1);
        Product p2 = new Product(502, "Mouse", 500, 2);
        p1.displayProduct();
        p2.displayProduct();
        Product.updateDiscount(15);
    }
}
