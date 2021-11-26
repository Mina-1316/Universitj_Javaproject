package cse.oop2.java_maven.ch10.practice;

public class Duck {
    private int size = 0;
    private static int duckCount = 0;
    private int nth;

    private static Duck[] ducks;

    public Duck(){
        this(10);
    }

    public Duck(int size){
        this.size = size;
        nth = duckCount++;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("나는 ");
        sb.append(nth);
        sb.append("번째 오리이고, ");
        sb.append("크기는 ").append(size).append("입니다.");

        return sb.toString();
    }

    public static void initialize(){
        ducks = new Duck[10];

        ducks[0] = new Duck();

        for(int i=1;i<ducks.length;i++){
            int size = (int)(Math.random()*20)+10;
            ducks[i]=new Duck(size);
        }
    }
    
    public static void main(String[] args){
        initialize();

        for (Duck d : ducks){
            System.out.println(d);
        }
    
    }
}
