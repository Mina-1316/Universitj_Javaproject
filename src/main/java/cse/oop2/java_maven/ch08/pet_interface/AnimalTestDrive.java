package cse.oop2.java_maven.ch08.pet_interface;

import cse.oop2.java_maven.ch08.animal_list.Animal;
import java.util.ArrayList;
import java.util.List;

public class AnimalTestDrive {
    public static void main(String[] args){
        List<Animal> list = new ArrayList<>();
        Dog a = new Dog();
        Cat c = new Cat();

        list.add(a);
        list.add(c);

        System.out.println("동물이 "+list.size()+"마리 있습니다. \n");

        for(var animal:list){
            System.out.println(animal.getClass().getName()+":");
            animal.makeNoise();
            animal.sleep();
            //instanceof => animal이 가르키는 인스턴스가 Dog인지, Cat인지 확인
            if(animal instanceof Dog||animal instanceof Cat){
                //animal을 Pet으로 강제 타입캐스팅
                //Pet에서만 정이된 play()메소드 사용을 위함임.
                Pet p = (Pet) animal;
                p.play();

                //새 변수를 만들어 타입캐스팅 하는일 없이,
                //바로 타입캐스팅을 통해 메소드 호출
                ((Pet) animal).play();
            }
            System.out.println();
        }
    }
}
