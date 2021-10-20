package cse.oop2.java_maven.ch04.diff_behavior;

public class DogTestDrive {

    public static void main(String[] args){
        Dog one = new Dog();
        one.size = 70;

        Dog two = new Dog();
        two.size = 8;

        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();
    }
}
