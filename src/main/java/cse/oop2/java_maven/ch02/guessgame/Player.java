package cse.oop2.java_maven.ch02.guessgame;

public class Player {
    int number;

     public void guess(){
        number=(int)(Math.random()*10);
        System.out.println("선택한 숫자 "+number);

    }

}
