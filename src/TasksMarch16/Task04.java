package TasksMarch16;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */


        ArrayList<String> isimListesi = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanIsimler = new ArrayList<>(); // bos list

        for (int i = 0; i < isimListesi.size(); i++) {
            if(!isimListesi.get(i).toLowerCase().contains("a")) {
                //listin herhangi bir elemani a harfini bulundurmuyorsa
                aOlmayanIsimler.add(isimListesi.get(i));
                //... yeni liste eklendi
            }
        }
        System.out.println("a olmayan isimler");
        System.out.println(aOlmayanIsimler);
    }
}
