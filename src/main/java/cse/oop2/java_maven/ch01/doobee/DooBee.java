/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_maven.ch01.doobee;

public class DooBee {
    
    public static void main(String[] args) {
        int x=1;
        
        while(x<3){
            System.out.print("Doo");
            System.out.print("Bee");
            x=x+1;
        }   //x가 1->3이 될때까지 2번 시행
        if(x==3){
            System.out.print("Do");
        }   
    }
}
