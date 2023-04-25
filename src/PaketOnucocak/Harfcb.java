//package PaketOnucocak;
//
//import java.util.Scanner;
//
//public class Harfcb {
//    public static void main(String[] args) {
//        char[] sesliHarfler = { 'a', 'e', 'o', 'ö', 'u' ,'ü', 'ı', 'i'};
//        String str = "codingbook";
//        for (int i=0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//            for(char ch :sesliHarfler) {
//                if(str.charAt(i) == ch) {
//                    System.out.println(str.charAt(i));}
//            }
//            System.out.println();       //33
//            System.out.println("=====================");
//            System.out.println();
//
//            for(int i=0; i < str.length(); i++) {
//            for(char ch: sesliHarfler) {
//                if(str.charAt(i) == ch) {
//                    System.out.println(str.charAt(i);
//                }else {
//                    System.out.println(str.charAt(i));
//                    exitLoop = true;
//                    break;
//                }
//            }
//        }
//    }
//}
//metot2
package PaketOnucocak;
import java.util.Scanner;
    public class Harfcb {
        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.println("lütfen bir kelime giriniz");
            String klm= input.next();
            String kelime= klm.toLowerCase();
            String sesli="aeıioöuü";
            String sessiz="zywvtşsrpnrmlkhjğgdçcb";
            String sesliler="";
            String sessizler="";
            String sessizilk="";
            for (int i = 0; i <kelime.length() ; i++) {
                if (sesli.contains(kelime.substring(i,i+1))){
                    continue;                }
                sessizler+=kelime.charAt(i);            }
            for (int i = 0; i <kelime.length() ; i++) {
                if (sessiz.contains(kelime.substring(i,i+1))){
                    continue;}
                sesliler+=kelime.charAt(i);            }
            for (int i = 0; i <kelime.length() ; i++) {
                if (sessiz.contains(kelime.substring(i,i+1))){
                    sessizilk+=kelime.charAt(i);
                    break;}
            }
            System.out.println(sesliler);
            System.out.println(sessizler);
            System.out.println(sessizilk);}
    }