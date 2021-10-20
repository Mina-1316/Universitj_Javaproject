package cse.oop2.java_maven.ch06.dotcomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    //값이 변하지 않는다면 final로 지정
    private static final String alphabet = "abcdefg";
    private final int gridLength=7;

    //7x7 2차원 아니라 1차원임
    private int gridSize = 49;
    private final int[] grid=new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt+" ");

        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length()==0){
                return null;
            }
        }catch(IOException e){
            System.out.println("IOException: "+e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize){
        ArrayList<String> alphaCells = new ArrayList<String>();
        String temp=null;
        int[] coords=new int[comSize];
        int attempts=0;
        boolean success=false;

        int location=0;

        comCount++;
        int incr=1;

        if((comCount%2)==2){
            incr=gridLength;
        }

        while(!success&attempts++<200){
            location=(int)(Math.random()*gridSize);

            int x=0;
            success=true;
            while(success&&x<comSize){
                if(grid[location]==0){
                    coords[x++]=location;
                    location+=incr;
                    if(location>=gridSize){
                        success=false;
                    }
                    if(x>0&(location%gridLength==0)){
                        success=false;
                    }
                }
            }
        }

        int x=0;
        int row=0;
        int column=0;

        while(x<comSize){
            grid[coords[x]]=1;
            row=(int)(coords[x]/gridLength);
            column=coords[x]%gridLength;
            temp=String.valueOf(alphabet.charAt(column));

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}
