import java.text.DecimalFormat;

public class variablesConvertions {
    public static void main(String[]args) {
        int firstInt = 2;
        String intToString = Integer.toString(firstInt);

        String firstString ="5";
        int stringToInt = Integer.parseInt(firstString);

        double firstDouble = 5.0;
        int doubleToString = (int) firstDouble;


        DecimalFormat twoDecimal = new DecimalFormat("#.##");
        float d = 1.239f;
        double dd = 1.234;
        System.out.println(twoDecimal.format(dd));

        double floatToDoubble = (double) d;

        System.out.println(twoDecimal.format(floatToDoubble));


    }
}
