package cse.oop2.java_maven.ch03.intarraytest;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntArrayTest {
    public static final int MAX_NUMS = 1000;

    public void test(){
        int[] nums;
        long sum = 0;

        nums = new int[MAX_NUMS];
        for(int i=0;i<MAX_NUMS;i++){
            nums[i] = (int)(Math.random()*100);
            sum = sum + nums[i];
        }
        System.out.println("평균 1 : " + (float)sum/MAX_NUMS);

    }
}
