package PaketOnucocak;

import java.util.Scanner;

public class C01_ifStatment {
    public static void main(String[] args) {
        // Alinin yasi veriliyor, eger ali 18 veya daha buyukse yetiskindir diye yazdirin
        Scanner oku = new Scanner(System.in);
        System.out.println("Alinin yasi : "); int alininYasi = oku.nextInt();
        if (alininYasi>=18) {
            System.out.println("Ali " + alininYasi+" yasinda bir yetiskindir");
        }
        System.out.println("Code finished");
    }
}
