package PaketOnucocak;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class SayiTahminOyunu {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean exitGameCheck = true;
            for (int i = 0; i >= 0 && exitGameCheck; i++) {
                Date date=new Date();
                long seed = date.getTime();
                Random rnd = new Random(seed);
                System.out.println("Seed degeri : " + seed); // kontrol amaclıdır.
                int randomNum = rnd.nextInt(101);
                System.out.println("***********************Yeni Oyun***********************");
                System.out.println("Rastgele olustrulan sayi : " + randomNum); // Kontrol amaclıdır.
                String message = "";
                for (int j = 2; j >= 1; j--) {
                    System.out.println("Mevcut " + j + " hakkınız vardır. Lutfen 0-100 arası sayı tahmınınızı giriniz. (Cıkıs icin -1 giriniz)) :");
                    int userNum = scan.nextInt();
                    int difference = randomNum - userNum;
                    if (userNum == -1) {
                        message = "Cıkıs yaptınız.";
                        exitGameCheck = false;
                        break;}
                    else if (userNum != randomNum) {
                        int fark = Math.abs(userNum - randomNum);
                        // if (difference > 0) {
                        System.out.println(fark + " kadar yaklastınız.");
                        //  } else {
                        //  System.out.println(-1 * difference + " kadar yaklastınız.");
                        message = "Hakkınız bıtti, tutulan sayi : " + randomNum + " uzgunuz kaybettiniz.";}
                    else {
                        message = "Bravoo bildiniz.";
                        break;}
                }
                System.out.println(message);
                System.out.println("");}
        }
    }
//                Bir sayi tahmin oyunu yazacaksiniz. Kurallar ve adimlar su sekilde olmali:
//            1 - (0-100) arasi bir rastgele sayi aklinizda tutacaksiniz.
//                - Bunu yaparken seed degeri nedir ogrenin
//                - Mevcut zaman degerini seed degeri olarak kullanin
//            2 - Sonra kullaniciya 2 kere tahmin hakki veriyorsunuz.
//            3 - Kullanici dogru tahmin ederse "Bravo bildiniz" seklinde bir mesaj yazarsiniz
//            4 - Kullanici bilemezse "... kadar yaklastiniz" diye geri bildirimde bulunacaksiniz
//                (her zaman pozitif bir uzaklik soyleyeceksiniz)
//            5 - Kullanici -1 girdigi anda programiniz sonra erecek, o zamana kadar surekli yeni oyun baslayacak
// Odev1 - Yukaridaki soruyu iki for loop ile yapiniz