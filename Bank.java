class Method {
    String name;
    double balance;

    void deposit(double a) { balance += a; }

    void withdraw(double a) {
        if (a <= balance) balance -= a;
    }
}

class Bank {
    public static void main(String[] args) {
        Method m = new Method();
        m.name = "Aamna";
        m.balance = 1000;

        m.deposit(500);
        m.withdraw(200);

        System.out.println("Balance = " + m.balance);
    }
}