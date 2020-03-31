package Project.Study.RandomClass;

import java.util.Random;

public class Test1 {
    public static void main(String[]args){
        Random rand=new Random();
        for(int x=0;x<10;x++){
            System.out.print(rand.nextDouble()+"、");
        }
    }
}
