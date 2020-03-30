package Project.Study.RuntimeClass;

public class Test2 {
    public static void main(String[]args){
        Runtime run=Runtime.getRuntime();
        String str="";
        for(int x=0;x<2000;x++){
            str+=x;
        }
        System.out.println("【垃圾处理前的内存量】MAX="+run.maxMemory());
        System.out.println("【垃圾处理前的内存量】TOTAL="+run.totalMemory());
        System.out.println("【垃圾处理前的内存量】FREE="+run.freeMemory());
        run.gc();
        System.out.println("[垃圾处理后的内存量]MAX="+run.maxMemory());
        System.out.println("[垃圾处理后的内存量]TOTAL="+run.totalMemory());
        System.out.println("[垃圾处理后的内存量]FREE="+run.freeMemory());
    }
}
