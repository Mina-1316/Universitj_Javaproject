package cse.oop2.java_maven.ch05.dotcomgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {

    public String getUserInput(String prompt){
        String inputLine=null;
        System.out.print(prompt+": ");
        try{
            BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
            inputLine=is.readLine();

            if(inputLine.length()==0){
                return "-1";
            }
        }

        catch (IOException e){
            System.out.println("IOException: "+e);
        }

        if(inputLine!=null&&inputLine.matches("\\d")){
            return inputLine;
        }else{
            return "-1";
        }
    }


}
