package cse.oop2.java_maven.teamproject;

public class Professor {
    private String Pname; //교수이름
    private String Pnum; //교수번호
    private String password;//비밀번호
    private String RSnum;// 주민등록번호
    private String major;// 학과 <- 강의클래스에서?


    private String grade[];//학점

    public Professor(String pname, String pnum, String RSnum, String major) {
        Pname = pname;
        Pnum = pnum;
        this.RSnum = RSnum;
        this.major = major;
    }

//    @Override
//    public boolean equals(Object object){
//        GEmployee sample = (GEmployee) object;
//
//        if(sample.getIdNumber()==this.Pnum){
//            return true;
//        }else{
//            return false;
//        }
//    }

    public String getPnum() {
        return Pnum;
    }

    public String getMajor() {
        return major;
    }

    public String getPname() {
        return Pname;
    }
}
