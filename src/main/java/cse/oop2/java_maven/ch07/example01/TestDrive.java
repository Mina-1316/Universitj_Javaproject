package cse.oop2.java_maven.ch07.example01;

public class TestDrive {

    public static void main(String[] args) {
        Doctor doc = new Doctor(true);
        System.out.println(doc);
        doc.treatPatient();
        System.out.println();

        FamilyDoctor familyDoctor = new FamilyDoctor(true, false);
        System.out.println(familyDoctor);
        familyDoctor.treatPatient();
        familyDoctor.giveAdvice();
        System.out.println();

        Surgeon surgeon = new Surgeon(true);
        System.out.println(surgeon);
        surgeon.treatPatient();
        surgeon.makeIncision();
    }
}
