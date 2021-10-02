package cse.oop2.java_maven.ch02.drumkit;

public class DrumKitTestDrive {

    public static void main(String[] args){
        DrumKit d = new DrumKit();

        if(d.snare == true){
            d.playSnare();
            d.snare = false;
        }
        d.playTopHat();
    }

}
