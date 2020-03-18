package Project.Study.Enumeration;

class Color{
    private String title;
    private static final Color RED=new Color("红色");
    private static final Color GREEN=new Color("绿色");
    private static final Color BLUE=new Color("蓝色");
    private Color(String title){
        this.title=title;
    }
    public static Color getInstance(int ch){
        switch (ch){
            case 1:
                return RED;
            case 2:
                return GREEN;
            case 3:
                return BLUE;
            default:
                return null;
        }
    }
    public String toString(){
        return this.title;
    }
}
public class Test {
    public static void main(String []args){
        Color red=Color.getInstance(1);
        System.out.println(red);
    }
}
