class Atmbal {
    private double balance;

    void setBalance(double b) { balance = b; }

    void withdraw(double amt) {
        if(amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: "+amt);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getBalance() { return balance; }
}

class Atm {
    public static void main(String[] args) {
        Atmbal a = new Atmbal();
        a.setBalance(1000);

        a.withdraw(500);
        System.out.println("Balance: "+a.getBalance());

        a.withdraw(600);  
    }
}