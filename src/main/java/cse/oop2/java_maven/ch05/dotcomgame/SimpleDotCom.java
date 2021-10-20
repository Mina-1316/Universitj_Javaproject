package cse.oop2.java_maven.ch05.dotcomgame;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
    //private int numOfHits;

    String checkYourself(String stringGuess){
        String result = "miss";

        //old code
        /*for(int cell:locationCells){
            if(guess==cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }*/

        //new code for Fixed bugs:multiple hit on one point
        int indexSearch = locationCells.indexOf(stringGuess);
        if(indexSearch>=0){
            locationCells.remove(indexSearch);
            if(locationCells.isEmpty()) {
                result = "kill";
            }else{
                result="hit";
            }
        }


        return result;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }
}