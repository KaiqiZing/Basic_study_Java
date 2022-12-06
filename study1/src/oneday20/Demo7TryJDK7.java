package oneday20;
/*
    JDK7的新特性
    在try的后边可以增加一个(),在括号中可以定义流对象
    那么这个流对象的作用域就在try中有效
    try中的代码执行完毕,会自动把流对象释放,不用写finally
    格式:
        try(定义流对象;定义流对象....){
            可能会产出异常的代码
        }catch(异常类变量 变量名){
            异常的处理逻辑
        }
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7TryJDK7 {
    public static void main(String[] args) {
        try(
                FileInputStream file_read = new FileInputStream("abc.txt");
                FileOutputStream file_write = new FileOutputStream("abc.txt");
                ) {
            int len = 0;
            while ((len = file_read.read())!=-1){
                file_write.write(len);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }

}
