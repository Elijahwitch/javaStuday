public class Ex6_9 {
    public static void main(String args[]) {
        // you can call method from class without initialize(instance)
        System.out.println(MyMath2.add(200L, 100L));


        MyMath2 mm = new MyMath2();// It's instance.
        mm.a = 200L;
        mm.b = 100L;
        // ypu can call method from instance after constructs object
        System.out.println(mm.add());
    }
}
