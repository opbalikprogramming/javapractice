import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;


public class ArrayListCollectionClass {
    public static void main(String[] args) {
        ArrayList<String> progLanguange = new ArrayList<String>();
        progLanguange.add("C");
        progLanguange.add("C#");
        progLanguange.add("Javascript");
        progLanguange.add(0, "Java");
        progLanguange.set(2, "Python");

        progLanguange.remove(3);


        for (int x = 0; x < progLanguange.size(); x++) {
            System.out.println(progLanguange.get(x));
        }

        System.out.println(progLanguange);

        for (String i : progLanguange) {
            System.out.println(i);
        }

        ArrayList progLanguageCopy = new ArrayList();
        progLanguageCopy.addAll(progLanguange);
        progLanguageCopy.add("Lua");
        String anotherLanguange = "Ruby";
        progLanguageCopy.add(anotherLanguange);
        Iterator iteratorObjectName = progLanguageCopy.iterator();


        while (iteratorObjectName.hasNext()) {
            System.out.println(iteratorObjectName.next());
        }
        for (Object xy : progLanguageCopy) {
            System.out.println("Language: " + xy);
        }

        if (progLanguageCopy.contains(anotherLanguange)) {
            System.out.println("Ruby is here");
        }

        if (progLanguageCopy.containsAll(progLanguange)) {
            System.out.println("Everything is copied");
        }
        /*
        progLanguageCopy.clear();
        if(progLanguageCopy.isEmpty()){
            System.out.println("everything is deleted");
        }  clear arraylist and test if cleared */

        Object[] progArray = new Object[4];
        progArray = progLanguageCopy.toArray();

        for (Object yx : progArray) {
            System.out.println("Arraylist to array " + yx);
        }
        System.out.println(Arrays.toString(progArray));

    }
}
