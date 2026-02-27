class Powerbase {
    int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
}

class Power {
    public static void main(String[] args) {
        Powerbase p = new Powerbase();
        System.out.println(p.power(2, 3));
    }
}