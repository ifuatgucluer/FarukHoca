package PaketOnucocak;

import java.util.Scanner;

public class UcGunlukTekrar {
    public static void main(String[] args) {
        int sayi;
        sayi = 10; // sayi <= 10
        String str = "Sayi = ";
        double dd = 10.5;
        char ch = 'b';
        int uzunluk = str.length();
        boolean bb = true;
        bb=false;
        Object oo="wasdaff";

//        System.out.println("oo = " +oo);
//        System.out.println(str + sayi);
//        System.out.println("uzunluk\n = " + uzunluk);

//        Scanner oku = new Scanner(System.in);
//        System.out.print("Sari cizmeli Mehmet Aganin yasi = ");
//        int Sari cizmeli Mehmet Aganin yasi = oku.nextInt();
//        System.out.println("Sari cizmeli Mehmet Aga  = " + Sari cizmeli Mehmet Aganin yasi);
//        System.out.println("Sari cizmeli Mehmet Aganin Memleketi : ") ; String memleket = oku.nextString();

        //System.out.println("memleket = " + memleket);
        int ss1 = 200;
        byte bb1 = (byte) ss1;
        double pi = 22.0/7;
        ss1= (int) pi;
        String str1 = String.valueOf(pi);
        String str2 = "" +pi;
//        System.out.println("str1 = " + str1);
//        System.out.println("str2 = " + str2);
//        System.out.println("pi = " + pi);
        pi = 1+Double.parseDouble(str1);
        System.out.println("pi = " + pi);

//        ss1 = Integer.parseInt(str2);// hata verir ondalikl sayi dir int e aktarilamaz
//        System.out.println("ss1 = " + ss1);

        int ss2 = 15, ss3 =10;
        int ss5 = ss2*5+7-ss3;
     //System.out.println("ss5 = " + ss5);//72
        ss2 = ss2 +1;
        ss2 +=1;
        ss2 ++;
        ++ss2; // ss2=19;

        System.out.println("ss2 = " + ss2++);//20
        System.out.println("ss2 = " + ss2);//20

        ss2 *=5;
        System.out.println("ss2 = " + ss2);//100
        ss2 %=8;
        System.out.println("ss2 = " + ss2);//4

    }
}
