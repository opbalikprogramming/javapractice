import java.util.*;
public class RandomNumbers {
    public static void main(String[]args) {
        int range = 3;
        int min = 2;
        for (int x = 0; x < 10; x++) {

            int randomNumber = (int) (Math.random() *range) +min;
            System.out.println(randomNumber);
        }
    }
}
