class Method{
    void printArray(int[] arr){
        for(int i=0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

class Passarray{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50,60,70,80,90,100};
        Method m1=new Method();
        m1.printArray(arr);
    }
}