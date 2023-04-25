package OcaQuestions;

public class Q008 {
    public static void main(String[] args) {
        String [] [] arr = {{"A", "B", "C"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]+ " ");
                if (arr[i][j].equals("B")) {
                    continue;// bir etkisi yok
                }
            }
            continue;

        }
    }
}
/*
     What is the result?

A. A B C
A. A B C D E ---- > Dogru cevap
A. A B D E
A. Compilation fails
        */

