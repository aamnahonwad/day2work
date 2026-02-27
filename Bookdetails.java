class Book {
    String title, author;
    double price;
}

class Bookdetails{
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title="Java"; b1.author="XYZ"; b1.price=500;
        
        Book b2 = new Book();
        b2.title="Python"; b2.author="ABC"; b2.price=600;

        System.out.println(b1.title+" "+b1.author+" "+b1.price);
        System.out.println(b2.title+" "+b2.author+" "+b2.price);
    }
}