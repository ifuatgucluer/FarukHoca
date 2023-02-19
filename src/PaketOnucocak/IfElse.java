package PaketOnucocak;
public class IfElse {    public static void main(String[] args) {
        // yasi 20 uzeri olanlari kapidan gecir
        // cinsiyet erkek olanlari ayakta beklet
        String birey1="kadin";
        int birey1Yas=29;
        if (birey1.equals("erkek")){
            System.out.println("ayakta beklemelisin");
        }else {
            System.out.println("oturabilirsin");
        }
        if (birey1Yas>=20){
            System.out.println("kapidan gecebilirsin");
        }else {
            System.out.println("gecemezsin yasin kucuk");
        }
        String birey2="kadin";
        int birey2yas=25;
    }
}
