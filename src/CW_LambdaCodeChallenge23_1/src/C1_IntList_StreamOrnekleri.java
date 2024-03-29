package CW_LambdaCodeChallenge23_1.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(-5, -8, -2, -12, 0, 1, 12, 5, 6, 9, 15, 8));

        yazdir(list);
        System.out.println("negatifYazdir(list) = " + negatifYazdir(list));
        pozitifList(list);
        System.out.println("kareList(list) = " + kareList(list));
    }

    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    private static List<Integer> kareList(List<Integer> list){
        System.out.println();
        return list.stream().map(t-> t*t).collect(Collectors.toList());

    }



    // S3: pozitif olanlardan yeni bir liste olustur
    private static void pozitifList(List<Integer> list) {
        System.out.println();
        System.out.println(list.stream().filter(t-> t>0).collect(Collectors.toList()));

    }

    // S2: sadece negatif olanlari yazdir
    private static List<Integer> negatifYazdir(List<Integer>list) {
        return list.stream().filter(x-> x<0).collect(Collectors.toList());
    }
    // S1:listi aralarinda bosluk birakarak yazdiriniz
    private static void yazdir(List<Integer> list) {
        System.out.println();
        list.stream().forEach(x-> System.out.print( x + " "));
    }




    // S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim

    // S6: listin elemanlarini kucukten buyuge siralayalim

    // S7: listin elemanlarini buyukten kucuge siralayalim

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi 5 olanlardan yeni bir list olusturalim

    // S9: list pozitif elemanlari icn karelerini bulup birler basamagi 5 olmayanlardan yeni bir list olusturalim

    // S10 :list elemanlarini toplamini bulalim

    // S11 : peek ornegi cozelim - negatiflerin karelerinden list olusturalim

    /*
     peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
    ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
    yerde hata ayıklamayı desteklemek için vardır . Ara islemdir.. yapilam islemi gormek icin kullanilir

     */
    // S12 : listeden 5 den buyuk  sayi var mi? -anyMatch

    // S13 : listenin tum elemanlari sifirdan kucuk mu? -allMatch

    // S14: listenin 100 e esit elemani yok mu ? -noneMatch

    // S15: listenin sifira esit elemani yok mu? - noneMatch

    // S16:  listenin ilk 5 elemanini topla? - limit(5)

    // S17: listenin son bes elemaninin  listele -skip long





}