package cse.oop2.java_maven.teamproject;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GEmployeeTest {
    static ArrayList<GEmployee> gEmployeeArray = new ArrayList<GEmployee>();
    static ArrayList<Course> courseArray = new ArrayList<Course>();
    static ArrayList<Student> studentArray = new ArrayList<Student>();
    static ArrayList<Professor> professorArray = new ArrayList<Professor>();

    public static void main(String[] args){
        initialize();

        //로그인 테스트
        System.out.println("G101 홍길동 로그인 시도(1회차 실패, 2회차 성공)");

        int userIndex = gEmployeeArray.indexOf(gEmployeeArray.stream().
                filter(e->e.getIdNumber().equals("G101")).findFirst().orElse(null));
        System.out.println(userIndex);
        System.out.println("first try : " + gEmployeeArray.get(userIndex).tryLogin("0000000"));
        System.out.println("second try : " + gEmployeeArray.get(userIndex).tryLogin("1321633"));

        //비밀번호 변경 테스트
        //gEmployeeArray.get(userIndex).changePassword();

        //강의 추가 테스트
        gEmployeeArray.get(userIndex).addCourse(courseArray, professorArray);
        gEmployeeArray.get(userIndex).addCourse(courseArray, professorArray);
        gEmployeeArray.get(userIndex).addCourse(courseArray, professorArray);

        //강의 삭제 테스트
        //3번째 강의는 이미 강좌 개설로 인한 Forbidden 상태 생성
        gEmployeeArray.get(userIndex).removeCourse(courseArray);
        gEmployeeArray.get(userIndex).removeCourse(courseArray);
        gEmployeeArray.get(userIndex).removeCourse(courseArray);

        //청구서 청구 테스트
        //디버깅 툴을 통해 확인할 것
        gEmployeeArray.get(userIndex).printBill(courseArray, studentArray);

    }

    static void initialize(){
        try {
            gEmployeeArray.add(new GEmployee("G101", "홍길동", "9310201321633"));
            gEmployeeArray.add(new GEmployee("G102", "김기억", "9105031673265"));
            gEmployeeArray.add(new GEmployee("G103", "나니은", "9701090366799"));

            professorArray.add(new Professor("김봉팔","P101","6012111039273","소공"));
            professorArray.add(new Professor("이봉팔","P102","6012111039273","소공"));
            professorArray.add(new Professor("삼봉팔","P103","6012111039273","소공"));
            professorArray.add(new Professor("삼봉팔","P104","6012111039273","소공"));
        }
        catch(Exception e){
            System.out.println("Error occurred : "+ e);
            System.exit(-1);
        }
    }
}
