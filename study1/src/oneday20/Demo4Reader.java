package oneday20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
    java.io.Reader:字符输入流,是字符输入流的最顶层的父类,定义了一些共性的成员方法,是一个抽象类

    共性的成员方法:
        int read() 读取单个字符并返回。
        int read(char[] cbuf)一次读取多个字符,将字符读入数组。
        void close() 关闭该流并释放与之关联的所有资源。

    java.io.FileReader extends InputStreamReader extends Reader
    FileReader:文件字符输入流
    作用:把硬盘文件中的数据以字符的方式读取到内存中

    构造方法:
        FileReader(String fileName)
        FileReader(File file)
        参数:读取文件的数据源
            String fileName:文件的路径
            File file:一个文件
        FileReader构造方法的作用:
            1.创建一个FileReader对象
            2.会把FileReader对象指向要读取的文件
    字符输入流的使用步骤:
        1.创建FileReader对象,构造方法中绑定要读取的数据源
        2.使用FileReader对象中的方法read读取文件
        3.释放资源
 */
public class Demo4Reader {
    /*
    *     字符输入流的使用步骤:
        1.创建FileReader对象,构造方法中绑定要读取的数据源
        2.使用FileReader对象中的方法read读取文件
        3.释放资源
        * */
    public static void main(String[] args) throws IOException {
        FileReader reader_test = new FileReader("a.txt");
        // 读取多字符，将字符读入数组党总
        char[] cs = new char[1024];
        int len = 0;
        while ((len = reader_test.read(cs))!=-1){
            System.out.println(new String(cs)); //把字符数组转换为字符串
            System.out.println(new String(cs, 0, len)); // 把字符数组一部分转换为字符串

        }
        reader_test.close();

    }
}
