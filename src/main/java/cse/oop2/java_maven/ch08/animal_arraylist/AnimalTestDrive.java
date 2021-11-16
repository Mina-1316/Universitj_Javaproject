package cse.oop2.java_maven.ch08.animal_arraylist;

import java.util.ArrayList;
import java.util.List;

public class AnimalTestDrive {
    public static void main(String[] args){
        List<Animal> list = new ArrayList<>();
        Dog a = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();

        list.add(a);
        list.add(c);
        list.add(t);

        System.out.println("동물이 "+list.size()+"마리 있습니다. \n");
        //for(var animal : list)와 같은 동작
        //list 내의 자료형에 따라서, var 가 의미하는 자료형이 결정됨.
        for(Animal animal:list){
            System.out.println(animal.getClass().getName()+":");
            animal.makeNoise();
            animal.sleep();
            System.out.println();
        }
    }
}
