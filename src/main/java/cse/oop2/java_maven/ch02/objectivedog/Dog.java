/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_maven.ch02.objectivedog;

/**
 *
 * @author Jebediah
 */
public class Dog {
    int size;
    String breed;
    String name;
    
    public Dog(){
    }
    
    public Dog(int size, String breed, String name){
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    
    void bark(){
        System.out.println(name+"이/가 짖습니다");
    }
}
