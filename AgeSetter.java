class Person {
    private int age;
    void setAge(int a) { if(a>=0) age=a; }
    int getAge() { return age; }
}

class AgeSetter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(20);
        System.out.println(p.getAge());
        p.setAge(-5);  
        System.out.println(p.getAge());
    }
}