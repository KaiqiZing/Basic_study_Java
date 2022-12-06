package oneday20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    java.io.InputStream:字节输入流
    此抽象类是表示字节输入流的所有类的超类。

    定义了所有子类共性的方法:
         int read()从输入流中读取数据的下一个字节。
         int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
         void close() 关闭此输入流并释放与该流关联的所有系统资源。

    java.io.FileInputStream extends InputStream
    FileInputStream:文件字节输入流
    作用:把硬盘文件中的数据,读取到内存中使用

    构造方法:
        FileInputStream(String name)
        FileInputStream(File file)
        参数:读取文件的数据源
            String name:文件的路径
            File file:文件
        构造方法的作用:
            1.会创建一个FileInputStream对象
            2.会把FileInputStream对象指定构造方法中要读取的文件

    读取数据的原理(硬盘-->内存)
        java程序-->JVM-->OS-->OS读取数据的方法-->读取文件

 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        /*
        * 字节输入流的使用步骤(重点):
        1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        2.使用FileInputStream对象中的方法read,读取文件
        3.释放资源
        * */
        FileInputStream read_data = new FileInputStream("abc.txt");
//        System.out.println(read_data.read());
        /*
        * 布尔表达式：（len = read_data.read()）!=-1
        * read_data.read()读取一个字节；
        * len = read_data.read()把读取的字节赋值给变量len;
        * （len = read_data.read()）!=-1;判断变量len是否等于-1，（-1代表读取文件的末尾）
        * */
//        int data = 0;
//        while ((data = read_data.read()) !=-1){
//            System.out.println(data);
//        }

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = read_data.read(bytes)) !=-1){
            System.out.println("字节数组的一部分转换为字符串:"+new String(bytes, 0, len));
        }

        read_data.close();
    }
}
