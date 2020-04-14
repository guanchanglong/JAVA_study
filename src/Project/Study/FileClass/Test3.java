package Project.Study.FileClass;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[]args)throws Exception{
        File file=new File("d:"+File.separator+"my.jpg");//设置文件路径
        if (file.exists()){
            System.out.println("是否有文件："+(file.isFile()));
            System.out.println("是否是目录："+(file.isDirectory()));
            //文件大小是按照字节单位返回的数字，所以需要将字节转换为兆(M)的单元
            //但是考虑到小数点问题，所以使用BigDecimal处理
            System.out.println("文件大小："+(new BigDecimal((double)file.length()/1024/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP))+"M");
            //返回的日期是以long的形式返回，可以利用SimpleDateFormat进行格式化操作
            System.out.println("上次修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
        }
    }
}
