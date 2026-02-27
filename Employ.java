class Employee {
    private double salary;  

    // setter method
    void setSalary(double s) {
        salary = s;
    }

    // getter method
    double getSalary() {
        return salary;
    }
}

class Employ {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        e1.setSalary(25000);   
        System.out.println("Salary: " + e1.getSalary());  
    }
}