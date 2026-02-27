class Method{
    void isPrime(int n){
      if(n<=1){
        System.out.println("false");
        return;
      }
      for(int i=2;i*i<=n;i++){
        if(n%i==0){
            System.out.println("false");
            return;
        }
    }
    System.out.println("true");
    }
}
class Prime{
    public static void main(String[] args){
        Method m1=new Method();
        m1.isPrime(7);
    }
}