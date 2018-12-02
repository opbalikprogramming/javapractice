public class ArrayAgain {
    private int [] arrayVar = new int[30];
    private int arraySize = 10;

    public void generateArray() {
        for(int i = 0; i < arraySize; i++){
            arrayVar[i] = (int) (Math.random()*10) +0;
        }
    }

    public void printArray() {
        for(int i = 0; i < arraySize; i++){
            System.out.print(arrayVar[i] + " ");
        }
    }

    public boolean isContain(int testIfhas) {
        boolean test = false;
        for(int i = 0; i < arraySize; i++){
            if (arrayVar[i]==testIfhas) {
                test = true;
            }
        }
        return test;
    }

    public static void main(String[] args) {
        ArrayAgain Obj = new ArrayAgain();
        Obj.generateArray();
        Obj.printArray();
    }


    

}
