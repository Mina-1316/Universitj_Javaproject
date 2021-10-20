package cse.oop2.java_maven.ch05.dotcomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotComGame {
    public static void main(String[] args){
        int numOfGuesses=0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom=new SimpleDotCom();
        int randomNum=(int)(Math.random()*5);
        System.out.format("(randomNumber = %s)%n",randomNum);

        int[] locations = {randomNum,randomNum+1,randomNum+2};
        ArrayList locationsArray = new ArrayList();
        for(int i:locations){
            locationsArray.add(Integer.toString(i));
        }

        theDotCom.setLocationCells(locationsArray);

        boolean isAlive = true;
        while(isAlive){
            String guess = helper.getUserInput("enter a number");
            String result= theDotCom.checkYourself((guess));

            numOfGuesses++;
            if(result.equals("kill")){
                isAlive=false;
                System.out.println("You took "+numOfGuesses+ "guesses");
            }
        }
    }
}
