package cse.oop2.java_maven.ch02.guessgameimproved;

public class GuessGame {
    public static int maxplayer = 5;
    Player[] players = new Player[maxplayer];
    gradingModule gradeModule = new gradingModule();

    public void startGame(){
        this.gameinit();

        while(true){
            gradeModule.generateAnswer();

            System.out.println("각 플레이어로부터 값을 수집합니다");
            for(int i=0;i<maxplayer;i++){
                players[i].guess(i);
            }

            System.out.println("정답을 채점합니다");

            if(gradeModule.printGrade(players)) {
                System.out.println("정답을 맞춘 플레이어가 존재합니다. 프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("정답을 맞춘 플레이어가 없습니다. 게임을 재개합니다.");
            }
        }
    }

    private void gameinit(){
        for(int i=0;i<maxplayer;i++){
            players[i] = new Player();
        }
        gradeModule.initModule(maxplayer);
    }
}
