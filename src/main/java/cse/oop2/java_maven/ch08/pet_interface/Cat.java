package cse.oop2.java_maven.ch08.pet_interface;

import cse.oop2.java_maven.ch08.animal_list.*;

public class Cat extends Animal implements Pet {
    @Override
    public void makeNoise() {
        System.out.println("야옹야옹");
    }

    @Override
    public void play() {
        System.out.println("그루밍을 하면서 잘 놉니다.");
    }
}
