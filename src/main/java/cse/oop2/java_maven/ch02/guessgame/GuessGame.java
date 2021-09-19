package cse.oop2.java_maven.ch02.guessgame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();

        int guess1p=0;
        int guess2p=0;
        int guess3p=0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetnumber = (int)(Math.random()*10);
        System.out.println("0이상 9 이하의 숫자를 맞춰보세요");

        while(true){
            System.out.println("맞춰야 할 숫자는 "+targetnumber+"입니다");

            p1.guess();
            p2.guess();
            p3.guess();

            guess1p = p1.number;
            guess2p = p2.number;
            guess3p = p3.number;

            System.out.println("1번 선수가 선택한 숫자: "+guess1p);
            System.out.println("2번 선수가 선택한 숫자: "+guess2p);
            System.out.println("3번 선수가 선택한 숫자: "+guess3p);

            if(guess1p==targetnumber){
                p1isright=true;
            }
            if (guess2p == targetnumber) {
                p2isright=true;
            }
            if(guess3p==targetnumber){
                p3isright=true;
            }

            if(p1isright||p2isright||p3isright){

                System.out.println("맞춘 선수가 있습니다.");

                System.out.println("1번 선수: "+p1isright);
                System.out.println("2번 선수: "+p2isright);
                System.out.println("3번 선수: "+p3isright);
                System.out.println("게임 끝");

                break;
            }
            else{
                System.out.println("다시 시도해야 합니다.");
            }


        }

    }

}
