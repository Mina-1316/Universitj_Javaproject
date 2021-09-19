package cse.oop2.java_maven.ch02.guessgameimproved;

public class gradingModule {
    private int answer;
    private boolean someonePassed;
    int answerMaxRange;

    public void initModule(int input){
        input = this.answerMaxRange;
    }

    public void generateAnswer(){
        this.answer = (int)(Math.random()*this.answerMaxRange);
        this.someonePassed = false;
    }

    public boolean printGrade(Player[] players){
        boolean isAnswerCorrect = false;

        System.out.println("맞춰야 할 정답은 "+this.answer+"입니다.");

        for(int i=0;i<players.length;i++) {
            System.out.printf("%d번 플레이어: ", i);
            this.grading(players[i].number);
            System.out.println();
        }
        return this.someonePassed;
    }

    private void grading(int input){
        if(input == this.answer){
            System.out.print("정답입니다.");
            this.someonePassed = true;
        }
        else{
            System.out.print("오답입니다.");
        }
    }
}
