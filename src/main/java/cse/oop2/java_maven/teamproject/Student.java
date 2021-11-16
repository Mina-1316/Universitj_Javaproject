package cse.oop2.java_maven.teamproject;


import java.util.ArrayList;

public class Student extends User{
    private ArrayList<Bill> billList = new ArrayList<Bill>();

    private int stuId; //학번 == 아이디
    private String stuName; //이름
    private String stuMajor; //학과
    private int stulocalNum; //주민등록번호
    private int stuPw; // 비밀번호
    private int sbjScore; //학점


    public Student(int stuId, String stuName, String stuMajor, int stulocalNum, int stuPw, int sbjScore) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuMajor = stuMajor;
        this.stulocalNum = stulocalNum;
        this.stuPw = stuPw;
        this.sbjScore = sbjScore;
    }

    public void addBill(Bill input){
        billList.add(input);
    }
}
