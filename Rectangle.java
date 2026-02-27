class Rectangle{
   double length;
   double width;

   double area(){
    return length*width;
   }
 public static void main(String[] args){
    Rectangle r1=new Rectangle();
    r1.length=10;
    r1.width=5;

    double result=r1.area();

    System.out.println("the area of the rectangle is" + result);

    }
 }
