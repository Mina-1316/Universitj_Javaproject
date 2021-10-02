package cse.oop2.java_maven.ch02.guessgameimproved;

public class Player {
    int number;

     public void guess(int num){
         //Math.random() 대신 java.util.Random().nextInt(int)를 사용하는게 더 나음
        number=(int)(Math.random()*10);
        System.out.println(num+"번 플레이어가 선택한 숫자: "+number);

    }

}
