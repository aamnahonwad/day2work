class Method{
    void display(int a,int b){
        int res=a+b;
        System.out.println("sum of " + a + "and" + b + "is" + res );
    }
}
class Add{
    public static void main(String[] args){
        Method m1=new Method();
        m1.display(10,20);
    }
}