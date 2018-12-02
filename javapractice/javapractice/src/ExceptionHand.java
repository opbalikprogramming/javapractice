public class ExceptionHand {
    public static void divideByzero(int a){
        try{
            System.out.print(a/0);
        }catch(ArithmeticException e){
            System.out.println("Wrong arithmitic");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();

        }
    }
}

