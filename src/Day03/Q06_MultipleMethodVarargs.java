package Day03;//package Day03;
//public class Q06_MultipleMethodVarargs {
//    /*
//	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
//	yazdıran parametreli method yazınız
// */
//package interviewQuetions.Day03;
//
//        import java.util.ArrayList;
//        import java.util.List;
//
//    public class Q06_MultipleMethodVarargs {
//        public static void main(String[] args) {
//
///*
//	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
//	yazdıran parametreli method yazınız
// */
//
//
//          ArrayList<Integer>notlar=new ArrayList<>(List.of(6,4,3,5));
//
//            notOrtalaması(notlar);
//        }
//        private static void notOrtalaması(ArrayList<Integer> list) {
//            int toplam=0;
//            for (int i = 0; i < list.size(); i++) {
//                toplam+=list.get(i);
//            }
//            int ortalama=toplam/list.size();
//            System.out.println("not ortalaması " + ortalama);
//        }
//    }
//}