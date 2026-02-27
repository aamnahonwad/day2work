class Studdetails{

    String name;
    int rollNo;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {

        Studdetails s1 = new Studdetails();   

        s1.name = "Aamna";
        s1.rollNo = 101;
        s1.marks = 89.5;

        s1.display();  
    }
}