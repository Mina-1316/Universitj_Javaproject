package cse.oop2.java_maven.ch08.animal_list;

public class MyAnimalList {
    private Animal[] animals = new Animal[5];
    private int nextIndex =0;

    public void add(Animal a){
        if(nextIndex <animals.length){
            animals[nextIndex]=a;
            System.out.println("Animal added at "+ nextIndex);
            nextIndex++;
        }
    }

    public Animal get(int i){
        Animal a = null;
        if(i>=0&&i< nextIndex){
            a=animals[i];

        }
        return a;
    }

    public int getNextIndex() {
        return nextIndex;
    }
}
