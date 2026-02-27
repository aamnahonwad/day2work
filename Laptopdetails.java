class Laptop {
    String brand; int ram; double price;
    void displayDetails() {
        System.out.println(brand+" "+ram+"GB "+price);
    }
}

class Laptopdetails {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand="Dell"; l.ram=8; l.price=45000;
        l.displayDetails();
    }
}