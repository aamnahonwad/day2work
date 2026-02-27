class Method{
    String reversal(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }
}

class Reverse{
    public static void main(String[] args) {
        Method r = new Method();
        System.out.println(r.reversal("Hello"));
    }
}