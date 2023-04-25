package Day03;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q01_UniqeArray {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT : {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10}
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     */
    public static void main(String[] args) {

        int [] arr = {1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        List<Integer> liste = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!liste.contains(arr[i])) {
                liste.add(arr[i]);
        }
//        ArrayList<Integer>sayiList=new ArrayList<>(List.of(1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10));
//        ArrayList<Integer>yeniList=new ArrayList<>();
//
//        for (int i = 0; i < sayiList.size(); i++) {
//            if (!yeniList.contains(sayiList.get(i))) {
//                yeniList.add(sayiList.get(i));
//            }
        }

        System.out.println(liste);//[1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]

    }
}
