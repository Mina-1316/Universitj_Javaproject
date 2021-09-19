/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_maven.week2.codemagnet;

public class CodeMagnet {

    public static void main(String[] args) {
        int x=3;
        
        while(x>0){
            if(x>2){
                System.out.print("a");
            }
            
            if(x==2){
                System.out.print("b c");
            }
            
            x=x-1;
            System.out.print("-"); 
            
            if(x==1){
                System.out.print("d");
                x=x-1;
            }
            
        }
        
    }
    
}
