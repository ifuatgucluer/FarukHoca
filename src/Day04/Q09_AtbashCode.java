package Day04;

import java.util.Scanner;

public class Q09_AtbashCode {
    /*
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sifrelenecek ifadeyi giriniz :");
        String ifade = scan.nextLine().toLowerCase();
        String sifreliifade = "";
        for (int i = 0; i < ifade.length(); i++) {
            int index = 'z'-ifade.charAt(i);
            sifreliifade += ((char)(('a')+ index));
        }
        System.out.println("sifreliifade = " + sifreliifade);

    }


}
