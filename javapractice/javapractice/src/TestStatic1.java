public class TestStatic1 {
    public static int a = 5;
    public int b = 10;


    public static void main(String[] args) {
        TestStatic1 t1 = new TestStatic1();
        TestStatic1 t2 = new TestStatic1();
        TestStatic1 t3 = new TestStatic1();
        TestStatic1.a = 1;//some value But you can not access instance variable like this

        System.out.println(t1.a);
        System.out.println(t2.a);
        t1.b = 15; // will not be reflected in t2.
        System.out.println(t1.b); // this will print 15
        System.out.println(t2.b); // this will still print 10;
        //source https://stackoverflow.com/questions/21204589/static-vs-instance-variables-difference
    }
}