package oneday20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习:一读一写
    文件复制的步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
        5.释放资源
 */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        long current_time = System.currentTimeMillis();
        FileInputStream read_data = new FileInputStream("a.txt");
        FileOutputStream write_data = new FileOutputStream("abc.txt");


        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = read_data.read(bytes))!=-1){
            write_data.write(bytes, 0, len);
        }
        read_data.close();
        write_data.close();
        long current_over = System.currentTimeMillis();
        System.out.println("复制文件耗时！！！"+ (current_over-current_time)+"毫秒");

    }

}
