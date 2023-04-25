package Day05.lesson06;//package Day05.lesson06;
//
//
//import java.util.Scanner;
//
//public class Tekrar {
//    public static void main(String[] args) {
//        // Stringi ters çevir
//        //       String str = "javaCAN & JAVATAR";
//
//        // Output = RAVATAJ & NACavaj
//        //     tersCevir(str);
//        //}
//        //private static void tersCevir(String str) {
//        //  String s3="";
//        //for (int i = 0; i < str.length(); i++) {
//        //  s3=str.charAt(i) + s3; // j, aj, vaj
//        //}
//        //System.out.println(s3);//RATAVAJ & NACavaj
//
//        //}
//
//        //}
//          /*  TASK :
//		 	Create a method to convert Roman numerals to numbers
//		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
//		 	Input:
//		 		System.out.println(romanNumbers(805));
//		   		System.out.println(fromRomans("DCCCV"));
//		   	Output: DCCCV   805
//
//		   		M + [C M] + [X L] + V   ---->   1945
//		   		The chars in the brackets are in ascending order.
//		   		 Parantez içindeki karakterler artan sıradadır
//		   		 (C-100, M-1000) ---> [C M]=900
//
//		   	 	I= 1
//                V= 5
//                X= 10
//                L= 50
//                C= 100;
//                D= 500;
//                M= 1000;
//
//
//
//                DCCCV
//                500+ 100+ 100+ 100+ 5 =805
//
//                M CM XL V
//                1000+ 900+ 40+ 5 =1945
//
//		*/
//        String s = "MCMXLV";
//        romenRakami(s);
//
//    }
//    private static int romenRakami(String s) {
//        int toplam = 0;
//        // iki harfin bir araya gelmesinden olusan sayilar toplanir
//        // ornek : CM = 900
//
//        for (int i = 0; i < s.length() - 1; i++) {
//            if (harfinDegeri(s.charAt(i)))
//        }
//
//
//    }
//    private static int harfinDegeri(char a) {
//        if ( a == 'I') return 1;
//        if (a == 'V') return 5;
//        if (a == 'X') return 10;
//        if (a == 'L') return 50;
//        if (a == 'C') return 100;
//        if (a == 'D') return 500;
//        if (a == 'M') return 1000;
//
//    }
//
//
//
//
//
//        String s = "MCMXLV";
//        romenRakami(s);
//        System.out.println(romenRakami(s));
//
//    }
//
//    private static int romenRakami(String s) {
//    int toplam = 0;
//        // iki harfin bir araya gelmesinden oluşan sayılar toplanır
//        // örnek: CM= 900
//        // M V
//
//        for (int i = 0; i < s.length()-1; i++) {
//            if (harfinDegeri(s.charAt(i)) < harfinDegeri(s.charAt(i + 1))) {
//                toplam += harfinDegeri(s.charAt(i+1)) - harfinDegeri(s.charAt(i));
//                s=s.replace(s.substring(i,i+2), "");
//                i--;
//            }//900+10 = 940 toplam
//        }
//        for (int i = 0; i < s.length(); i++) {
//            toplam+= harfinDegeri(s.charAt(i));
//        }//1945 = toplam
//
//        return toplam;
//    }
//
//    private static int harfinDegeri(char a) {
//        if (a == 'I') return 1;
//        if (a == 'V') return 5;
//        if (a == 'X') return 10;
//        if (a == 'L') return 50;
//        if (a == 'C') return 100;
//        if (a == 'D') return 500;
//        if (a == 'M') return 1000;
//        return 0;
//    }
//
//
//}
//
//        // kullanıcıdan alınan iki sayının okekini bul
//        // input= 10, 20
//        // output= 20
//
//        // input2= 11, 24
//        // output= 11*24
////        Scanner scan = new Scanner(System.in);
////        System.out.println("Birinci sayiyi giriniz :");
////        int sayi1 = scan.nextInt();
////        System.out.println("Ikinci sayiyi giriniz :");
////        int sayi2 = scan.nextInt();
////        int buyuk = Math.max(sayi1,sayi2);
////        int ekok=0;
////
////        for (int i = buyuk; i <= sayi1*sayi2 ; i++) {// i = 20 ' den basliyo 200' e kadar gidiyor
////            // 11 ile 24 verirsek 264 ' e kadar if'in ici hep false olur
////            // iki sayidan buyuk olanla donguye baslandi
////            // hic ortak bolen yok ise sayilarin carpimina kadar devam edecek
////            if(i%sayi1==0 && i%sayi2==0){
////                ekok=i;
////                break;
////            }
////        }
////        System.out.println("Ekok = " + ekok);
////    }
////}
