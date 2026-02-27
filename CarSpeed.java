class Car {
    private int speed;

  
    void setSpeed(int s) {
        if (s >= 0) {
            speed = s;
        } else {
            System.out.println("Speed cannot be negative!");
        }
    }

    
    int getSpeed() {
        return speed;
    }
}

class CarSpeed {
    public static void main(String[] args) {
        Car c1 = new Car();

        c1.setSpeed(80);
        System.out.println("Car Speed: " + c1.getSpeed());

        c1.setSpeed(-20);  
    }
}