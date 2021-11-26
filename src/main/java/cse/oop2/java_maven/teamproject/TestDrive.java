package cse.oop2.java_maven.teamproject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;


public class TestDrive {
    static ArrayList<Student> studentsArray = new ArrayList<>();
    static ArrayList<Lecture> lecturesArray = new ArrayList<>();
    static ArrayList<Professor> professorsArray = new ArrayList<>();
    static ArrayList<HEmployee> hEmployeesArray = new ArrayList<>();
    static ArrayList<GEmployee> gEmployeesArray = new ArrayList<>();
   
    public static void main(String[] args){
        initialize();
        login();
    }
   
   
   
    public static void login(){
        final String idInputPattern = "^[A-Z]{1}\\d{3}$";
       
        String idInput;
        while(true){
        //ID 로그인
        while(true){
            System.out.print("ID를 입력해주세요 : ");
            idInput = getConsoleInput();
           
            if(!Pattern.matches(idInputPattern, idInput)){
                System.out.println("학번 입력이 잘못되었습니다. 다시 입력해 주세요.");
            }else{
                break;
            }
        }
        final String finalIdInput = idInput;
        //비밀번호 검사
        switch(idInput.charAt(0)){
            case 'S':
                Student studentToLogin = studentsArray.stream().
                        filter(e->e.getStuId().equals(finalIdInput)).findFirst().orElse(null);
               
                if(studentToLogin==null){
                    System.out.println("존재하지 않는 사용자입니다. 다시 시도하세요.");
                }else{
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pwInput = getConsoleInput();
                   
                    if(!studentToLogin.getStuNewPw().equals(pwInput)){
                        System.out.println("비밀번호가 틀렸습니다.");
                    }else{
                        studentMenu(studentToLogin);
                    }
                }
                break;
               
            case 'P':
                Professor professorToLogin = professorsArray.stream().
                        filter(e->e.getPnum().equals(finalIdInput)).findFirst().orElse(null);
               
                if(professorToLogin==null){
                    System.out.println("존재하지 않는 사용자입니다. 다시 시도하세요.");
                }else{
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pwInput = getConsoleInput();
                   
                    if(!professorToLogin.getPW().equals(pwInput)){
                        System.out.println("비밀번호가 틀렸습니다.");
                    }else{
                        professorMenu(professorToLogin);
                    }
                }
                break;
               
            case 'H':
                HEmployee hEmployeeToLogin = hEmployeesArray.stream().
                        filter(e->e.getNumber().equals(finalIdInput)).findFirst().orElse(null);
               
                if(hEmployeeToLogin==null){
                    System.out.println("존재하지 않는 사용자입니다. 다시 시도하세요.");
                }else{
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pwInput = getConsoleInput();
                   
                    if(!hEmployeeToLogin.getPw().equals(pwInput)){
                        System.out.println("비밀번호가 틀렸습니다.");
                    }else{
                        hEmployeeMenu(hEmployeeToLogin);
                    }
                }
                break;
               
            case 'G':
                GEmployee gEmployeeToLogin = gEmployeesArray.stream().
                        filter(e->e.getIdNumber().equals(finalIdInput)).findFirst().orElse(null);
               
                if(gEmployeeToLogin==null){
                    System.out.println("존재하지 않는 사용자입니다. 다시 시도하세요.");
                }else{
                    System.out.print("비밀번호를 입력하세요 : ");
                    String pwInput = getConsoleInput();
                   
                    if(!gEmployeeToLogin.getPassword().equals(pwInput)){
                        System.out.println("비밀번호가 틀렸습니다.");
                    }else{
                        gEmployeeMenu(gEmployeeToLogin);
                    }
                }
                break;
            default:
                System.out.println("학번 입력이 잘못되었습니다. 다시 입력해 주세요.");
                break;
        }
    }
    }
    

   
    public static void studentMenu(Student loginBy){
        System.out.println(loginBy.getStuName() + "님 안녕하세요.");
        int menuInput=0;
       
        while(true){
            System.out.println("1. 수강 신청");
            System.out.println("2. 수강목록 확인");
            System.out.println("3. 성적 조회");
            System.out.println("4. 청구서 출력");
            System.out.println("5. 비밀번호 변경");
            System.out.println("6. 로그아웃");
            try{
                menuInput = Integer.parseInt(getConsoleInput());}
            catch(NumberFormatException e){
                System.out.println("숫자만 입력하실 수 있습니다.");
                continue;
            }
            switch(menuInput){
                case 1:
                    //수강신청 메소드 호출
                    loginBy.signStud();
                    break;
                case 2:
                    //수강목록 메소드 호출
                    loginBy.printMyClassList();
                    break;
                case 3:
                    //성적 조회 메소드 호출
                    loginBy.printMyClassGradeList();
                    break;
                case 4:
                    //청구서 출력
                    loginBy.printBill();
                    break;
                case 5: 
                    //비밀번호 변경
                    loginBy.setStuRNum(getConsoleInput());
                    break;
                case 6:
                    //로그아웃
                    return;
            }
        }
    }
   
    public static void professorMenu(Professor loginBy){
        System.out.println(loginBy.getProfName() + "님 안녕하세요.");
        int menuInput=0;
       
        while(true){
            System.out.println("1. 출석부 조회");
            System.out.println("2. 성적 입력");
            System.out.println("3. 학생 명단");
            System.out.println("4. 로그아웃");
            try{
                menuInput = Integer.parseInt(getConsoleInput());}
            catch(NumberFormatException e){
                System.out.println("숫자만 입력하실 수 있습니다.");
                continue;
            }
            switch(menuInput){
                case 1:
                    //출석부 조회 메소드 호출
                    loginBy.Allstudents();
                    break;
                case 2:
                    loginBy.InputGrade();
                    break;
                case 3:
                    //학생 명단 메소드 호출
                    loginBy.Attendance();
                    break;
                case 4:
                    //로그아웃
                    return;
            }
        }
    }
   
    public static void gEmployeeMenu(GEmployee loginBy){
        System.out.println(loginBy.getName() + "님 안녕하세요.");
        int menuInput=0;
       
        while(true){
            System.out.println("1. 강의 추가");
            System.out.println("2. 강의 삭제");
            System.out.println("3. 수강료 청구서 출력");
            System.out.println("4. 로그아웃");
            try{
                menuInput = Integer.parseInt(getConsoleInput());}
            catch(NumberFormatException e){
                System.out.println("숫자만 입력하실 수 있습니다.");
                continue;
            }
            switch(menuInput){
                case 1:
                    //강의 추가 메소드 호출
                    loginBy.addCourse(lecturesArray, professorsArray);
                    break;
                case 2:
                    //강의 삭제 메소드 호출
                    loginBy.removeCourse(lecturesArray);
                    break;
                case 3:
                    //수강료 청구서 출력 메소드 호출
                    loginBy.printBill(lecturesArray, studentsArray);
                    break;
                case 4:
                    //로그아웃
                    return;
            }
        }
    }
   
    public static void hEmployeeMenu(HEmployee loginBy){
        System.out.println(loginBy.getName()+ "님 안녕하세요.");
        int menuInput=0;
       
        while(true){
            System.out.println("1. 사용자 등록");
            System.out.println("2. 사용자 삭제");
            System.out.println("3. 사용자 조회");
            System.out.println("4. 사용자 수정");
            System.out.println("5. 로그아웃");
            try{
                menuInput = Integer.parseInt(getConsoleInput());}
            catch(NumberFormatException e){
                System.out.println("숫자만 입력하실 수 있습니다.");
                continue;
            }
            switch(menuInput){
                case 1:
                    //사용자 등록 메소드 호출
                    loginBy.addUser();
                    break;
                case 2:
                    //사용자 삭제 메소드 호출
                    loginBy.deleteUser();
                    break;
                case 3:
                    //사용자 조회 메소드 호출
                    loginBy.checkUser();
                    break;
                case 4:
                    //사용자 수정 메소드 호출
                    loginBy.reviseUser();
                    break;
                case 5:
                    //로그아웃
                    return;
            }
        }
    }
   
    public static String getConsoleInput(){
        try{
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
           
            return inputStream.readLine();
        }
        catch(IOException e){
            System.err.print("에러가 발생했습니다 : " + e);
            return null;
        }
    }
    
    public static void initialize(){
        //This method is for initializing test program.
        //이 메소드는 테스트 프로그램의 초기화를 위해 생성되었습니다.
        //If you want to build this project, please comment out this method's call section.
        //만약 이 프로젝트를 빌드하고 싶으시다면, 이 메소드 호출부를 전부 주석처리 해주십시오.
        
        studentsArray.add(new Student("S101", "김기억", "컴퓨터소프트웨어공학과", "0001131372652"));
        
        
        
        
        
    }
    
}