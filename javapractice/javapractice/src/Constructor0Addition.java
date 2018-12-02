public class Constructor0Addition {
    int firstnum;
    int secondnum;

    public int getNum() {

        return (firstnum+secondnum);
    }

    Constructor0Addition() { //Default Constructor
        firstnum =5;
        secondnum=10;
    }

    Constructor0Addition(int a, int b) {
        firstnum =a;
        secondnum =b;
    }

}
