import java.text.DecimalFormat;

public class Algo01ArrayStructure {

    private int[] theArray = new int[10];
    private int arraySize=theArray.length;





    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray() {
        System.out.println("-------------");
        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("-------------");

        }
    }

    public int getValue(int index) {
        if(index < arraySize)
            return theArray[index];
        return 0;
    }

    public boolean isArrayContain(int searchValue) {
        boolean valueInArray = false;
        for(int i = 0; i < arraySize; i++){
            if (theArray[i] == searchValue) {
                valueInArray =true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for(int i = index; i < (arraySize -1); i++){
                theArray[i] = theArray[i + 1];
            }
        }
        arraySize--;
    }

    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
        }
        arraySize++;
    }

    public void replace(int index, int replacer) {
        if (arraySize < 50) {
            theArray[index] = replacer;
        }
    }

    public void linearSearchForValue(int value) {
        boolean valueInArray = false;
        String indexesWithValue = "";
        System.out.println("The Value was Found in index: ");
        for(int i = 0; i < arraySize; i++){
            if (theArray[i] == value) {
                valueInArray = true;
                System.out.print(i +" ");
                indexesWithValue+= i +" ";
            }
        }
        if (!valueInArray) {
            indexesWithValue = "None";
            System.out.println(indexesWithValue);
        }
    }


    public void bubbleSort() {

        for(int i = arraySize-1; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                if (theArray[j] > theArray[j+1] ) {
                    int temp = theArray[j];
                    theArray[j] = theArray[j + 1];
                    theArray[j + 1] = temp;
                }
            }
        }

    }

    public void binarySearch(int value){
        int lowIndex =0;
        int highInderx =theArray.length-1;

        while (lowIndex <= highInderx){
            int middleIndex = (highInderx + lowIndex)/2;

            //di tapos
        }

    }


    public void reverseArray() {
        for(int i = 0; i < theArray.length/2; i++){
            int temp = theArray[i];
            theArray[i] = theArray[theArray.length - 1 - i];
            theArray[theArray.length - 1 - i] = temp;
        }
    }





    public static void main(String[] args) {
        Algo01ArrayStructure arrayObj = new Algo01ArrayStructure();

        arrayObj.generateRandomArray();
        arrayObj.printArray();
        System.out.println("\n\n\n\n");

        arrayObj.bubbleSort();
        arrayObj.printArray();



        //arrayObj.reverseArray();
        //arrayObj.printArray();
        //System.out.println(arrayObj.getValue(5));
        //System.out.println(arrayObj.isArrayContain(15));

        //arrayObj.deleteIndex(4);
        //arrayObj.printArray();

        //arrayObj.insertValue(30);
        //arrayObj.printArray();

        //arrayObj.replace(0 , 99);
        //arrayObj.printArray();

        //arrayObj.linearSearchForValue(15);





























    }
}















//private  static int[] anotherArray = {4,1,2,3,5};

        /*for Bubble sorting purposes only
        arrayObj.looop();
        System.out.println("\n \n");


        for(int i = 0; i < anotherArray.length; i++){
            System.out.println(anotherArray[i]);
        }    */

         /*for Bubble sorting purposes only
   public void looop() {
        int comparison =0;
        for(int i = anotherArray.length-1; i > 0 ; i--){

            for(int j = 0; j < i; j++){
                comparison= comparison +1;
                System.out.println(comparison);
                if (anotherArray[j] > anotherArray[j + 1]) {
                    int temp = anotherArray[j];
                    anotherArray[j] = anotherArray[j + 1];
                    anotherArray[j + 1] = temp;
                }

            }
        }

    }
*/

