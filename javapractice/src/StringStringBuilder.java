import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringStringBuilder {
    public static void main(String[] args) {
        Scanner inpText = new Scanner(System.in);
        String randString = "I know nothing";

        String randStringNoSpace = randString.replace(" ", "");
        System.out.println(randStringNoSpace);

        String upperCaseStr = "LARGE";
        String lowerCaseStr = "large";

        if (upperCaseStr.equalsIgnoreCase(lowerCaseStr)) {
            System.out.println("String are equal");
        }


        String letter1 = " jfaiod";
        String letter2 = " a";


        System.out.println("2nd char from letter is: "+ letter1.charAt(1));
        System.out.println(letter1.compareTo(letter2));
        System.out.println(letter1.contains("f"));
        System.out.println(letter1.endsWith("od"));
        System.out.println(letter1.indexOf("j"));


        System.out.println(letter1.indexOf("o",2));
        System.out.println(letter1.length());

        String[] letterArray = letter1.split(",");
        System.out.println(Arrays.toString(letterArray));

        System.out.println(letter1.toUpperCase());
        System.out.println(letter1.substring(1, 3));


        StringBuilder strB = new StringBuilder(("hello "));

        System.out.println(strB.append("World"));

        System.out.println(strB.delete(6, 13));

        System.out.println(strB.capacity());

        strB.ensureCapacity(60);

        System.out.println(strB.capacity());

        strB.trimToSize();
        System.out.println(strB.capacity());

        System.out.println("Enter String : ");
        strB.setLength(0);
        strB.append(inpText.nextLine());

        System.out.println(strB);
        System.out.println(args);
    }
}
