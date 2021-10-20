package cse.oop2.java_maven.ch03.stream;

public enum Gender {
    FEMALE("female"),
    MALE("male");

    private String info;

    private Gender(String info){
        this.info = info;
    }

    public String toString(){
        return info;
    }
}
