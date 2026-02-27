class Product {
    private String productName;
    private double price;

    
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

 
    String getProductName() {
        return productName;
    }

    double getPrice() {
        return price;
    }

 
    void setProductName(String productName) {
        this.productName = productName;
    }

    void setPrice(double price) {
        this.price = price;
    }
}

class ProductName{
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);

        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Price: " + p1.getPrice());
    }
}