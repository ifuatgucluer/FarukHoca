package OcaQuestions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {

        public static void main(String[] args) {
String date = LocalDate
        .parse("2014-05-04") // time is not assigned here
        .format(DateTimeFormatter.BASIC_ISO_DATE); // _TIME should be removed

        System.out.println(date);
                    }
    }
    /*
     What is the result?

A. An exception is thrown at runtime --> Dogru Cevap
B.10 : 22 : 22
B.10 : 22 : 20
B.10 : 22 : 6
        */
