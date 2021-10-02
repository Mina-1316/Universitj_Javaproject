package cse.oop2.java_maven.ch02.objectivemovie;

public class Movie {

    String title;
    String genre;
    int rating;

    void playlt(){
        System.out.printf("%s(장르: %s, %d등급) 영화를 상영합니다.%n",title,genre,rating);
    }

}
