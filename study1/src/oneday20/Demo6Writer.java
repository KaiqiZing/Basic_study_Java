package oneday20;

import java.io.FileWriter;
import java.io.IOException;
/*
    字符输出流写数据的其他方法
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */


/*
    续写和换行
    续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String fileName,File file:写入数据的目的地
            boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
     换行:换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class Demo6Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt");
        /*
        * 字符输出流写数据*/
        char[] cs = {'a','b','c'};
        fw.write(cs);
        fw.flush();

        char[] chars = "测试字符串写入".toCharArray();
        fw.write(chars);
        fw.flush();


        fw.close();
        FileWriter fw_append = new FileWriter("abc.txt",true);
        for (int i = 0; i < 5; i++) {
            fw_append.write("test-content"+i+"\r\n");
        }

        fw_append.flush();
        fw_append.close();
    }
}
