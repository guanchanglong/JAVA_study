package Project.Study.RuntimeClass;

public class Test1 {
    public static void main(String[]args){
        Runtime run=Runtime.getRuntime();
        System.out.println("MAX="+run.maxMemory());
        System.out.println("TOTAL="+run.totalMemory());
        System.out.println("FREE="+run.freeMemory());
    }
}
