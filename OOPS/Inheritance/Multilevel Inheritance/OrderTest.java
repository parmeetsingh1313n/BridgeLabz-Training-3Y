// Base class
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order placed. ID: " + orderId);
    }
}

// ShippedOrder extends Order
class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Order shipped with Tracking No: " + trackingNumber);
    }
}

// DeliveredOrder extends ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    void getOrderStatus() {
        System.out.println("Order delivered on: " + deliveryDate);
    }
}

public class OrderTest{
    public static void main(String[] args) {
        DeliveredOrder d1 = new DeliveredOrder(1001, "2025-09-19", "TRK123", "2025-09-21");
        d1.getOrderStatus();
    }
}
