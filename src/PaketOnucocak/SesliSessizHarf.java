package PaketOnucocak;
import java.util.Scanner; public class SesliSessizHarf {
//    //1 - Asagidaki programlari yaziniz 50 puan):kullanicidan bir string aliyoruz.    O stringeki karakterlerden sadece sesli harfleri yazdiriyoruz
//    Stringdeki karakerlerdedn sadece sessiz harfleri yazdiriyoruz Stringdeki karakterlerden sadece ilk sessiz harfi yazdirip sonra loopdan cikiyoruz
    public static class Stringifadeler {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Bir kelime giriniz");
            String kelime = input.nextLine();
            System.out.println("Girdiğiniz kelime: " + kelime);
            System.out.print("Sesli harfle: ");
            for (int i = 0; i < kelime.length(); i++) {
                char c = kelime.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'ı' || c == 'ü' || c == 'ö') {
                    System.out.print(c);}
            }
            System.out.print("\nSessiz harfler: ");
            for (int i = 0; i < kelime.length(); i++) {
                char c = kelime.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'ı' && c != 'ü' && c != 'ö'&& c !=' ') {
                    // Cıkarılması gereken karakterler arasına bosluguda ekledim birden fazla kelime iceren sessizz harfleri cıkarrırken bosluk olmuyor.
                    System.out.print(c);
                    continue;}
            }
            System.out.print("\nİlk Sessiz Harf: ");
            for (int i = 0; i < kelime.length(); i++) {
                char c = kelime.charAt(i);
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'ı' && c != 'ü' && c != 'ö' ) {
                    System.out.print(c);
                    break;}
            }
        }
    }
}
