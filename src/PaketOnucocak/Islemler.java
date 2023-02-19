package PaketOnucocak;

import java.util.Scanner;

public class Islemler {


        public static void main(String[] args) {
            Scanner girdi=new Scanner (System.in);
            System.out.println("Lütfen birinci sayıyı giriniz");
            int a=girdi.nextInt();
            System.out.println("Lütfen ikinci sayıyı giriniz");
            int b=girdi.nextInt();

            int toplam=a+b;
            int fark=a-b;
            int carpim=a*b;
            double bolum=(double)a/b;

            System.out.println("Toplam:"+toplam);
            System.out.println("Fark:"+fark);
            System.out.println("Çarpım:"+carpim);
            System.out.println("Bölüm:"+bolum);
        }
    }

