package Day03;

public class Q04_TestKeyword {
    public static void main(String[] args) {


 /*
    ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin 7 dogru cevabi var.
    2 nolu ogrencinin 6 dogru cevabi var.
       "           "
       "           "
       "           "
    8 nolu ogrencinin 7 dogru cevabi var.
*/


        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        int dogruSayisi;
        for (int i = 0; i < answers.length; i++) {
            dogruSayisi=0;
            for (int j = 0; j < answers[i].length && j<keys.length; j++){
                if (answers[i][j] == keys[j]) {
                    dogruSayisi++;
                }
            }
            System.out.println(i + " . öğrencinin doğru sayısı " +  dogruSayisi);
        }
    }
}
