import java.util.Arrays;
import java.util.LinkedList;


public class LinkedListCollectioonClass {
    public static void main(String []args){


        LinkedList linkedList1 = new LinkedList<String>();

        LinkedList<String> progLanguage = new LinkedList<String>();

        progLanguage.add("C#");
        progLanguage.add("C");
        progLanguage.add("C++");
        progLanguage.set(0, "Java");
        progLanguage.addLast("Python");

        for(String prog: progLanguage){
            System.out.println(prog);
        }

        LinkedList progCopy = new LinkedList(progLanguage);

        System.out.println(progCopy.toString());

    }
}
