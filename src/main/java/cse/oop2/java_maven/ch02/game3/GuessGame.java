package cse.oop2.java_maven.ch02.game3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class GuessGame {
    //순서대로 정답의 최대 범위, 최대 도전 가능한 횟수, 컴퓨터가 생성한 정답
    static private int maxAnswerRange = 99;
    static private int maxChance = 5;
    private int answer=0;

    //플레이어들의 이름을 받아 두는 배열
    String[] PlayerList;

    //정답으로 사용할 랜덤한 난수 생성
    private void generateRandNum(){
        Random Random = new Random();
        answer=Random.nextInt(maxAnswerRange);
    }

    //정답을 콘솔로부터 입력받는 메소드. String을 int로 변환한다.
    private int getAnswer() throws IOException{
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(is.readLine());
    }

    //정답 채점 메소드. 핵심
    private boolean gradeAnswer() throws IOException{
        //등록되어 있는 플레이어 수만큼 반복하는 반복문
        for(int num=0;num<PlayerList.length;num++){
            System.out.println(PlayerList[num] + "님 차례입니다:");
            //잘못된 응답을 막기 위해, While을 통해 무한반복문을 만들어, 올바른 값이 입력될때까지 반복
            while(true) {
                System.out.print("0~" + maxAnswerRange + "까지 숫자를 추측해서 입력해 주세요 :");
                int answerReceived = getAnswer();
                //값이 지정한 범위를 넘어갈 경우
                if((answerReceived>maxAnswerRange)||(answerReceived<0)){
                    System.out.println("임력한 답이 범위를 벗어납니다. 다시 입력해주세요.");
                    continue;
                }
                //입력한 값이 정답인지 아닌지 채점하는 코드
                if (answer == answerReceived) {
                    System.out.println(PlayerList[num] + "님이 이겼습니다.");
                    return true;
                } else {
                    System.out.println("틀렸습니다.");
                    break;
                }
            }
        }
        //모든 플레이어가 답을 제출해도 정답이 없을 경우 실패로 간주, false 리턴
        return false;
    }

    //플레이어 리스트를 생성하는 메소드
    private void makePlayer() throws IOException{
        System.out.println("사용자 이름을 차례대로 입력해 주세요(/로 이름 구별) : ");
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String input = is.readLine();
        // '/'로 구분된 String을 토큰으로 나눠, 변환하기 편하게 한다.
        //참고 - https://codingdog.tistory.com/entry/java-stringtokenizer-%EA%B5%AC%EB%B6%84%EC%9E%90%EB%A5%BC-%EA%B8%B0%EC%A4%80%EC%9C%BC%EB%A1%9C-%EB%AC%B8%EC%9E%90%EC%97%B4%EC%9D%84-%EC%9E%90%EB%A5%B8%EB%8B%A4
        StringTokenizer token = new StringTokenizer(input, "/");

        //ArrayList형 배열 생성 - 가변길이 배열을 생성하여, while문을 통해 토큰에 저장된 값을 배열로 옮겨담음
        List<String> tempPlayerList = new ArrayList<String>();
        while(token.hasMoreTokens()){
            tempPlayerList.add(token.nextToken());
        }

        //완성된 임시 배열을 클래스 내에 있는 배열로 옮겨주는 과정. 옮겨줄 때는 더이상 길이가 변할 일이 없기 때문에
        //일반 배열로 변환해서 전달한다.
        PlayerList = new String[tempPlayerList.size()];
        tempPlayerList.toArray(PlayerList);
    }

    public void startGame() throws IOException{
        System.out.println("컴퓨터가 임의로 생성한 0~"+maxAnswerRange+"까지 숫자를 맞추는 게임입니다.");
        System.out.println(maxChance+"안에 맞추면 맞춘 사람이 이기고, 그렇지 않으면 컴퓨터가 이깁니다.");
        System.out.println("이제 시작하겠습니다.");

        generateRandNum();
        makePlayer();

        for(int i=1;i<=maxChance+1;i++){
            if(i>maxChance){
                System.out.println("컴퓨터가 이겼습니다.");
                return;
            }
            System.out.println(i + "번째 도전입니다.");
            if(gradeAnswer()){return;}
        }
    }
}
