class Emp{
    private int empno;      //雇员编号
    private String ename;   //雇员姓名
    private String job;     //雇员职位
    private double sal;     //雇员工资
    private double comm;    //佣金
    public Emp(){           //明确一个无参构造方法
    }
    public Emp(int eno,String ena,String j,double s,double c){//有参构造
        empno = eno;
        ename = ena;
        job = j;
        sal = s;
        comm = c;
    }
    public void setEmpno(int e){
        empno = e;
    }
    public void setEname(String e){
        ename = e;
    }
    public void setJob(String j){
        job = j;
    }
    public void setSal(double s){
        sal = s;
    }
    public void setComm(double c){
        comm = c;
    }
    public int getEmpno() {
        return empno;
    }
    public String getEname(){
        return ename;
    }
    public  String getJob(){
        return job;
    }
    public double getSal(){
        return sal;
    }
    public double getComm(){
        return comm;
    }
    public String getInfo(){
        return "雇员编号："+empno+"\n"+ "雇员姓名："+ename+"\n"+"雇员职位："+job+"\n"+"基本工资："+sal+"\n"+"佣金："+comm;
    }
}
public class Test1_7 {
    public static void main(String args[]){
        Emp e =new Emp(7369,"SMITH","CLERK",800.0,1.0);
        System.out.println(e.getInfo());
    }
}
