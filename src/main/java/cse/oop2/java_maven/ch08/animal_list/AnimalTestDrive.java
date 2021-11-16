package cse.oop2.java_maven.ch08.animal_list;

public class AnimalTestDrive {
    public static void main(String[] args){
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();

        list.add(a);
        list.add(c);
        list.add(t);

        System.out.println("동물이 "+list.getNextIndex() + "마리 있습니다.\n");

        for(int i=0;i<list.getNextIndex();i++){
            //list에서 get 해온 객체는 animal로, 정확히 무슨 객체인지 파악 불가능.
            // getClass() 사용하여 무슨 종류의 클래스인지 확인함
            System.out.println(list.get(i).getClass().getName()+":");

            list.get(i).makeNoise();
            list.get(i).sleep();
            System.out.println();
        }
    }
}
