package cse.oop2.java_maven.ch10.practice;

import java.util.LinkedList;
import java.util.List;

public class WrapperClassTest {

    public static void doSomething(List<Integer> numbers){
        System.out.print("첫 번째 출력 : ");
        numbers.forEach(e->System.out.print(e.toString()+" "));

        System.out.print("\n두 번째 출력 : ");
        for(int e:numbers){
            System.out.print(e+" ");
        }
    }

    public static void doConversion(){
        Integer i1 = new Integer("123"); //안좋아
        Integer i2 = Integer.parseInt("123"); //좋아

        String s1 = i1.toString();
        int number = i2.intValue();

        System.out.printf("%d %d %s %d %n", i1, i2, s1, number);

        try{
            Integer i3 = Integer.parseInt("123.5");
        }catch(NumberFormatException ex){
            System.err.println("예외 발생 : " + ex);
        }
    }



    public static void main(String[] args){
        List<Integer> numbers = new LinkedList<>();

        for(int i=0;i<20;i++){
            int value=(int)(Math.random()*100);
            numbers.add(value);
        }
        doSomething(numbers);
        doConversion();
    }

}
