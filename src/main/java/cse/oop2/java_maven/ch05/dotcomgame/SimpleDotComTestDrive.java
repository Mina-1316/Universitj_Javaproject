package cse.oop2.java_maven.ch05.dotcomgame;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        SimpleDotCom dot=new SimpleDotCom();

        ArrayList<String> locations = new ArrayList<String>(Arrays.asList("2","3","4"));
        dot.setLocationCells(locations);

        String[] userGuess={"1","2","2","2","3","4"};

        for(String guess:userGuess){
            System.out.printf("You shoot %s => ",guess);
            System.out.println(dot.checkYourself(guess));
        }
    }
}
