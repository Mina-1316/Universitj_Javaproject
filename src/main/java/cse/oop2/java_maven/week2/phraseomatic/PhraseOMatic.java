/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_maven.week2.phraseomatic;

public class PhraseOMatic {

    public static void main(String[] args) {
        //Wordlist 정의
        String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B",
            "win-win","front-end","web-based","pervasive","smart","six-sigma",
            "critical-path","dynamic"};
        
        String[] wordListTwo ={"empowered","sticky","value-added","oriented",
            "centric","distributed","clustered","branded","outside-the-box","positioned",
            "networked","focused","leveraged","aligned","targeted","shared","cooperative",
            "accelerated"};
        
        String[] wordListThree = {"process","tipping-point","solution","architecture",
            "core competency","strategy","mindshare","portal","space","vision","paradigm",
            "mission"};
        
        //각 Wordlist마다 몇개의 단어가 있는지 확인
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        //세 개의 난수를 발생
        int rand1=(int)(Math.random()*oneLength);
        int rand2=(int)(Math.random()*twoLength);
        int rand3=(int)(Math.random()*threeLength);
        
        //구문 생성
        String phrase = String.format("%s %s %s",
                wordListOne[rand1],wordListTwo[rand2],wordListThree[rand3]);
        
        //구문 출력
        System.out.println("What we need is a " + phrase);
        
    }
    
}
