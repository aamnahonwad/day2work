class Method{
    void max(int a,int b){
        if(a>b){
            System.out.println("a is larger");
        }
        else{
            System.out.println("b is larger");
        }  
    }
}
class Max{
    public static void main(String[] args){
        Method m1=new Method();
        m1.max(30,20);
    }
}