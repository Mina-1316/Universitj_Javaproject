package cse.oop2.java_maven.ch10;

public class SillyQuestion {

    public static void main(String[] args){
        test();

        SillyQuestion.test();

        SillyQuestion q = new SillyQuestion();
        q.test();
        
    }

    public static void test(){
        Duck d = new Duck();
    }
}

class Duck{
    public Duck(){
        System.out.println("Duck 객체 생성");
    }
}