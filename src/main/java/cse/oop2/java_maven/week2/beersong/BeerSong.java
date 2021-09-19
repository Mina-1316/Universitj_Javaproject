/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_maven.week2.beersong;


public class BeerSong {

    public static void main(String[] args) {
        int beerNum = 5;
        String word = "bottles";
        
        while(beerNum>0){
                   
           System.out.println(beerNum + " " + word + "of beer on the wall");
           System.out.printf("%d %s of beer%n", beerNum, word);
           System.out.println("Take one down.");
           System.out.println("Pass it around.");
           
           beerNum = beerNum - 1;
           
           if(beerNum==1){
                word = "bottle";
            }
           
           if(beerNum>0){
               System.out.println(beerNum + " " + word + "of beer on the wall");
           }
           else{
               System.out.println("No more bottles of beer on the wall");
           }
           
        }

    }
    
}
