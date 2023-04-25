package OcaQuestions.Q016;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dt;

public class Q016 {
    public static void main(String[] args) {
        LocalDateTime at = LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(30);//not assigned to at, no effects on at
        dt.plusMonths(1);//not assigned to at, no effects on at
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }
}
/*
     What is the result?

A. An expection is thrown at runtime //if it was written with.parse()...
B.  07-31-2014
C.  2014-07-31 -----> Dogru cevap
D.  2014-09-30

        */