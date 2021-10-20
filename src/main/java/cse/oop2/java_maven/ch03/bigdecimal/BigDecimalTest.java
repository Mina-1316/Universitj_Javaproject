package cse.oop2.java_maven.ch03.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args){
        double d1 = 12345.12345;
        double d2 = 12345678901234567890.0;
        System.out.format("d1 = %f, d2 = %f%n", d1, d2);

        BigDecimal n1 = new BigDecimal("5.6");
        BigDecimal n2 = new BigDecimal("5.8");

        BigDecimal result1 = n1.add(n2);

        System.out.format("n1 = %s, n2 = %s, result1 = %s%n", n1, n2, result1);

        d1 = 5.6;
        d2 = 5.8;

        double result2 = d1 + d2;
        System.out.format("d1 = %s, d2 = %s, result2 = %s%n", n1, n2, result2);
    }

    
}
