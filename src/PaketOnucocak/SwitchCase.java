package PaketOnucocak;
import java.util.Scanner;
public class SwitchCase {  public static void main(String[] args) {
        //switch case// 1 e basildiginda ana menu// 2 ye basildiginda islemler// 3 e basildiginda cikis
        System.out.println("ana menu icin 1 e \nislemler icin 2 e \ncikis icin 3 e basiniz");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("ana menu");
                //break;
            case 2:
                System.out.println("islemler");
                break;
            case 3:
            System.out.println("cikis yaptiniz yine bekleriz");
            break;
            default:
                System.out.println("hatali tuslama yaptiniz");
                break;
        }
    }
}

