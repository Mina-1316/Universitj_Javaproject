package cse.oop2.java_maven.ch02.game2;

import java.io.IOException;

public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GuessGame game = new GuessGame();
        game.startGame();
    }

}