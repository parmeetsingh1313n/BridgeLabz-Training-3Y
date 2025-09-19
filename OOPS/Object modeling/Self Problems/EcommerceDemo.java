import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    Order(int id) {
        this.orderId = id;
        products = new ArrayList<>();
    }

    void addProduct(Product p) {
        products.add(p);
    }

    void showOrder() {
        System.out.println("Order ID: " + orderId);
        for (Product p : products) {
            System.out.println(p.name + " - Rs." + p.price);
        }
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        o.showOrder();
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Customer c = new Customer("Ravi");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);

        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p2);

        c.placeOrder(o1);
    }
}
