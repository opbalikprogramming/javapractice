public class staticstatic {
    public static int num1 =0;
    public static void main(String[] args) {
        staticstatic obj = new staticstatic();
        obj.secondInstance();
        obj.firstInstance();
        System.out.println(num1);
    }

    public void firstInstance() {
        num1 =1;
        System.out.println(num1);
    }

    public void secondInstance() {
        num1 =2;
        System.out.println(num1);
    }
}
