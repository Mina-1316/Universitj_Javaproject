package cse.oop2.java_maven.ch07.example01;

public class FamilyDoctor extends Doctor{
    boolean makeHouseCalls;

    public FamilyDoctor(boolean makeHouseCalls, boolean worksAtHospital){
        super(worksAtHospital);
        this.makeHouseCalls=makeHouseCalls;
    }

    public void giveAdvice(){
        System.out.println("집에서 필요한 조언을 합니다.");
    }

}
