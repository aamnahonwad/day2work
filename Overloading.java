class Area {
    // Square
    int area(int side) {
        return side * side;
    }

    
    int area(int length, int breadth) {
        return length * breadth;
    }
}

class Overloading{
    public static void main(String[] args) {
        Area a = new Area();

        int squareArea = a.area(5);            
        int rectangleArea = a.area(4, 6);      

        System.out.println("Square Area: " + squareArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}