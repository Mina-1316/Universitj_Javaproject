package cse.oop2.java_maven.teamproject;

public class Course {

    private int CourseNum;
    private String Name;
    private int Credit;
    private String Department;
    private String Explanation;
    private int professor;
    private boolean set=false;
    private double tuition;
    private int minimum;
    private int maximum;
    // 강의명, 강좌번호, 학점, 학과, 강의 설명, 강의 개설 여부, 수강료, 최소, 최대 학생수

    public Course(int courseNum, String name, int credit, String department, String explanation, int professor, int minimum, int maximum) {
        CourseNum = courseNum;
        Name = name;
        Credit = credit;
        Department = department;
        Explanation = explanation;
        this.professor = professor;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    Course(String Name, int CourseNum, String Department, int Credit, String Explanation, int professor, int minimum, int maximum)
    {




        //강좌번호, 이름, 학과, 학점, 설명, 담당 교수, 최소, 최대 학생수
    }

    void makeNewLecture(){
        set=true;
    }

    public int getCourseNum(){
        return CourseNum;
    }


}
