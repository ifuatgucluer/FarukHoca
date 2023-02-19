package PaketOnucocak;
import java.util.Scanner;
public class TaskElly {
    public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("uc basamaklı sayı giriniz:");
//                int sayi = sc.nextInt();
//                int a=sayi%10;
//                int b=sayi%100/10;
//                int c=sayi/100;
//                System.out.println("birler basamagı :"+a);
//                System.out.println("onlar basamagı :"+b);
//                System.out.println("yüzler basamagı :"+c);


//   * Kullanicidan uc basamakli bir sayi alin
//   ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin

    Scanner scan = new Scanner(System.in);
        System.out.print("Üç Basamaklı Bir Sayı Giriniz : ");
                int sayi = scan.nextInt();

                int birler = sayi%10;
                int onlar = (sayi%100-birler)/10;
                int yuzler = (sayi -onlar*10+birler)/100;


                System.out.println("Birler Basamağı :" +birler);
                System.out.println("Onlar Basamağı :" +onlar);
                System.out.println("Yüzler Basamağı :" +yuzler);

                }
    }
