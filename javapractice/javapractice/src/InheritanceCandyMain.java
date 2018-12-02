public class InheritanceCandyMain {
    public static void main(String []args){

        InheritanceCandySubClass gumpdropsCinnamon = new InheritanceCandySubClass();
        InheritanceCandySubClass gumpdropsSpearmint = new InheritanceCandySubClass();

        gumpdropsCinnamon.giveCinammon();
        gumpdropsCinnamon.sugarAmount = 10;
        gumpdropsCinnamon.displaySugarAmount();


        gumpdropsSpearmint.givespearmint();
        gumpdropsSpearmint.sugarAmount = 5;
        gumpdropsSpearmint.displaySugarAmount();


    }
}
