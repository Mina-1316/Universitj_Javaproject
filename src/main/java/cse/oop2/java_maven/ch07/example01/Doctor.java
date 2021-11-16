package cse.oop2.java_maven.ch07.example01;


public class Doctor {
    
    boolean worksAtHospital;
    
    public Doctor(boolean worksAtHospital){
        this.worksAtHospital=worksAtHospital;
    }
    
    public void treatPatient(){
        System.out.println("진료를 합니다.");
    }

    @Override
    public String toString(){
        String result=null;

        if(worksAtHospital){
            result= getClass().getName()+"병원에서 일하는 의사입니다.";
        }else{
            result=getClass().getSimpleName()+": 집에서 일하는 의사입니다,";
        }
        return result;

    }
}
