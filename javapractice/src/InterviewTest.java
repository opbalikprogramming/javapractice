import java.util.*;
public class InterviewTest {

    public static void main(String[] args) {

        InterviewTest interTest = new InterviewTest();




        interTest.fibonacciSeries(0);
        interTest.swapTwoDigitsWithTemp(3,4);
        interTest.swapTwoDigitWithoutTemp(2,3);

            if (isPrime(3)) {
                System.out.println("prime");                //For
            } else {                                        //Test if
                System.out.println("not prime");            //Prime number or not
            }
        System.out.println(interTest.reverseString("derby"));// for reverse reverse string


        int arr[] = {1,2,3};
        System.out.println(Arrays.toString(interTest.reverseArry(arr)));//reverse string
    }



    public void fibonacciSeries(int size) {
        int temp;
        int x=0;
        int y=1;


        System.out.println(x);
        System.out.println(y);
        for (int i=0; i < size; i++) {
            temp =x+y;
            System.out.println(temp);
            x=y;
            y=temp;
        }
    }

    public void swapTwoDigitsWithTemp(int x, int y) {
        int temp;

        temp =x;
        x= y;
        y =temp;

        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);

    }

    public void swapTwoDigitWithoutTemp(int x, int y) {
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n % 2 == 0 && n!=2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 3; i*i<=n; i+=2) {
            if (n% i==0) {
                return false;
            }
        }
        return true;
    }

    public String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;

    }

    public int[] reverseArry(int[] numArray) {
        int[] reversed = new int[numArray.length];
        for (int i=0; i<numArray.length; i++) {
            reversed[i] = numArray[numArray.length - 1 - i];

        }

        return reversed;

    }





}
