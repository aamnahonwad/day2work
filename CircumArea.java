class Circle {
    double radius;
    double calculateArea() { return 3.14 * radius * radius; }
    double calculateCircumference() { return 2 * 3.14 * radius; }
}

class CircumArea{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Area: "+c.calculateArea());
        System.out.println("Circumference: "+c.calculateCircumference());
    }
}