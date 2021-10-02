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
public class DogTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog d1 = new Dog(30,"알라스카 말라뮤트", "멍멍"); //정의한 생성자를 이용한 생성
        d1.bark();
        
        Dog d2 = new Dog(); //기본 생성자를 이용한 생성
        d2.bark();
        
        Dog d3 = new Dog(); //기본 생성자를 이용한 생성 이후 초기화
        d3.name = "코코";
        d3.size = 40;
        d3.bark();
    }
    
}
