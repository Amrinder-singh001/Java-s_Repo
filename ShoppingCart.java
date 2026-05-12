class Product {

    String name;
    int price;
    int quantity;

    Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void totalPrice() {
        System.out.println("Total = " + (price * quantity));
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Product p = new Product("Laptop", 50000, 2);

        p.totalPrice();
    }  
}
