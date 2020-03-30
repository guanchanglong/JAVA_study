package Project.Study.RuntimeClass;

public class Test3 {
    public static void main(String[]args) throws Exception {
        Runtime run=Runtime.getRuntime();
        Process pro=run.exec("mspaint.exe");
        Thread.sleep(2000);
        pro.destroy();
    }
}
