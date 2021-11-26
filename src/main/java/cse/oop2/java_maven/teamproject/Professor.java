package cse.oop2.java_maven.teamproject;
import java.util.Scanner;
import java.util.ArrayList;


public class Professor {
     private String PW;//비밀번호
    private String Pnum;//교수번호
    private String RSnum;//주민등록번호
    private String ProfName;// 교수이름
    private String Major;// 전공


    public Professor(){
        
    }
    
    
  public Professor(String Pnum, String RSnum,String ProfName,String Major){
        this.Pnum=Pnum;
        this.RSnum=RSnum;
        this.ProfName=ProfName;
        this.Major=Major;
        this.PW = RSnum.substring(RSnum.length()-8,RSnum.length()-1);
    }
  public String getPW(){
      return PW;
  }
  public void setPW(String PW){
      this.PW=PW;
  }
  public String getPnum(){
      return Pnum;
  }
  public void setPnum(String Pnum){
      this.Pnum=Pnum;
  }
  public String RSnum(){
      return RSnum;
  }
  public void setRSnum(String RSnum){
      this.RSnum=RSnum;
  }
  public String getProfName(){
      return ProfName;
  }
  public void setProfName(String ProfName){
      this.ProfName=ProfName;
  }
public String getMajor(){
    return Major;
}
public void setMajor(String Major){
    this.Major=Major;
}



    
  
    ArrayList<Lecture> array = new ArrayList<>(); 
    ArrayList<Student> students = new ArrayList<>();
  
    Scanner sc = new Scanner(System.in);
        int sel; 
        int i;
        
   
   //학생 명단      
   public void Allstudents(){
       Scanner sc = new Scanner(System.in); // 스캐너 입력
    
       //강의 출력
       System.out.println("=============담당하는 강의입니다.=================");
            getLectureSelection();//담당하는 강의 전체 출력             
       System.out.println("================================================");
       System.out.print("명단 확인 할 강의를 선택하세요:");
         sel = sc.nextInt();
       
      
      
      
      Lecture selectedLecture = (Lecture)TestDrive.lecturesArray.stream().filter(
              e->e.getProfessor().equals(this)).toArray()[sel];
      // 메인에 있는 강의배열에서 담당교수가 선택한 값이 인덱스값과 같다면  따로 뽑아내서 배열로 변환
      
         
    System.out.println("선택한 강의는"+sel+"번"+selectedLecture.getLectName()+" 입니다.");
           //선택한 과목을 수강신청한 학생 출력
           
           //수강신청한 학생명단
           System.out.println("===============학생 명단================");
           
           ArrayList<Student> studList = selectedLecture.getRegisteredStudentArray();
           
           for(Student index : studList){
               System.out.println("학생 이름: "+index.getStuName() + "학번: "+index.getStuId());
               // 학생리스트에서  인덱스값 받아 학생클래스에 있는 메소드(EX)학생이름, 학번)
               // 수강신청한 학생 리스트 출력
           }
          
           
   }
        

   // 성적 입력
   public void InputGrade(){ 
       //담당하는  강의 출력
       Scanner sc = new Scanner(System.in);
       System.out.println("===============담당 강의 목록==============");
       getLectureSelection();
       System.out.println("===========================================");
       System.out.println("성적을 입력할 강의를 선택하세요");
       sel = sc.nextInt();
       
       
       //강의 선택
         Lecture selectedLecture = (Lecture)TestDrive.lecturesArray.stream().filter(
              e->e.getProfessor().equals(this)).toArray()[sel];
       
        ArrayList<Student> studList = selectedLecture.getRegisteredStudentArray();
        
       for(Student index : studList){ 
               System.out.println("학생 이름: "+index.getStuName() + "학번: "+index.getStuId());
       }
       
           //성적 입력할 학생 선택
        System.out.println("성적을 입력할 학생 번호를 입력하세요: ");
        int i = sc.nextInt();
        //성적을 입력하세요 : 
        System.out.println("성적을 입력하세요: ");
        char input = sc.nextLine().charAt(0);
        double score=0.0;
           
            
            
        switch(input){
            case 'A':
                   selectedLecture.setScore(i, 4.0);
                break;
               case 'B':
                    selectedLecture.setScore(i, 3.0);
                   break;
               case 'C':
                    selectedLecture.setScore(i, 2.0);
                   break;
               case 'D':
                   selectedLecture.setScore(i, 1.0);
                   break;
               case 'F':
                    selectedLecture.setScore(i, 0.0);
                   break;
        }          
    }
       
       //강의를 신청한 학생 출력   
       //학점 스위치문 추가
   
   
   
   
   
   
   
    // 출석부 조회
   public void Attendance(){
       Scanner sc = new Scanner(System.in);
       System.out.println("===============담당하는 강의 목록===============");
       getLectureSelection();// 담당하는 강의 전체 출력
       
       System.out.println("================================================");
       System.out.print("출석부를 확인할 강의를 선택하세요: ");
         sel = sc.nextInt();
       
       Lecture selectedLecture = (Lecture)TestDrive.lecturesArray.stream().filter(
              e->e.getProfessor().equals(this)).toArray()[sel];
       // 메인에 있는 강의배열에서 담당교수가 선택한 값이 인덱스값과 같다면 배열로 생성
       System.out.println("선택한 강의는"+sel+"번"+selectedLecture.getLectName()+" 입니다.");
           
    //학생 출력
       System.out.println("===============출석부===============");
       
           ArrayList<Student> studList = array.get(i).getRegisteredStudentArray();
           
           for(Student index : studList){
               System.out.println("학생이름: "+ index.getStuName()+
                       "학번: "+index.getStuId()+"학점: "+selectedLecture.getScore(index));//성적 추가
               
           } // 학생리스트에서  인덱스별로 받아 학생클래스에 있는 메소드(EX)학생이름, 학번)
           // 성적까지 출력
          
}
 
   

//담당하는 총 강의를 출력하는 메소드
   public void getLectureSelection(){ 
       Scanner sc = new Scanner(System.in);
     
       TestDrive.lecturesArray.stream().filter(e->e.getProfessor().equals(this)).forEach(e->
                System.out.println("강의 이름 : " + e.getLectName()+"       "
                       + "강의 번호" + e.getLectNum())
       ); // 담당하는 강의의 이름과 강의번호
//       
//       int input = sc.nextInt();
//       return input;
//            
               
   }

}