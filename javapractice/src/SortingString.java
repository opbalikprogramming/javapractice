import java.util.Arrays;

public class SortingString {
    public static String sortString(String inputString) {
        char [] temp = inputString.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void main(String[] args) {
        String inputString = "fsdnmfbsadbfhaewhlfgbsdvhabsfbahlabdfbsdhfbbjldbLJABGSHFGBDSF";
        String outString = sortString(inputString);
        System.out.println(outString);
    }
}
