package oneday20.Demo1;

import java.io.File;
import java.io.IOException;

/*
    File类获取功能的方法
        - public String getAbsolutePath() ：返回此File的绝对路径名字符串。
        - public String getPath() ：将此File转换为路径名字符串。
        - public String getName()  ：返回由此File表示的文件或目录的名称。
        - public long length()  ：返回由此File表示的文件的长度。
 */
public class Demo3File {
    public static void main(String[] args) throws IOException {
//        show1();
        //

//        show2();

//        show3File();
        show4File();
    }



    private  static void show1(){
        File file = new File("1.txt");
        System.out.println("返回文件的绝对路径名称："+file.getAbsolutePath());
        System.out.println(file.getPath());
    }

    /*
    File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
 */
    private static void show2(){
        File file1 = new File("/Volumes/DataValue2/Basic_study_Java/");
        if (file1.isDirectory()){
            System.out.println("是目录");
        }else if (file1.isFile()){
            System.out.println("是文件");
        }else {
            System.out.println("未知的类型");
        }
    }

    /*
    File类创建删除功能的方法
        - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        - public boolean delete() ：删除由此File表示的文件或目录。
        - public boolean mkdir() ：创建由此File表示的目录。
        - public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
 */
    private static void show3File() throws IOException {

            /*
        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        创建文件的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件不存在,创建文件,返回true
            false:文件存在,不会创建,返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件的路径必须存在,否则会抛出异常

        public boolean createNewFile() throws IOException
        createNewFile声明抛出了IOException,我们调用这个方法,就必须的处理这个异常,要么throws,要么trycatch
     */

        File fileCreateNewFile = new File("/Volumes/DataValue2/Basic_study_Java/new.txt");
        boolean bl1 = fileCreateNewFile.createNewFile();
        System.out.println(bl1);


           /*
        public boolean delete() ：删除由此File表示的文件或目录。
        此方法,可以删除构造方法路径中给出的文件/文件夹
        返回值:布尔值
            true:文件/文件夹删除成功,返回true
            false:文件夹中有内容,不会删除返回false;构造方法中路径不存在false
        注意:
            delete方法是直接在硬盘删除文件/文件夹,不走回收站,删除要谨慎
     */
        File fileDelete = new File("/Volumes/DataValue2/Basic_study_Java/new.txt");
        boolean bl2 = fileDelete.delete();
        System.out.println("删除文件/文件夹成功："+ bl2);

         /*
       public boolean mkdir() ：创建单级空文件夹
       public boolean mkdirs() ：既可以创建单级空文件夹,也可以创建多级文件夹
       创建文件夹的路径和名称在构造方法中给出(构造方法的参数)
        返回值:布尔值
            true:文件夹不存在,创建文件夹,返回true
            false:文件夹存在,不会创建,返回false;构造方法中给出的路径不存在返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
     */
        File fileMkdirs = new File("/Volumes/DataValue2/Basic_study_Java/newFile1/newFile2");
        boolean bl3 = fileMkdirs.mkdirs();
        System.out.println("创建多个文件成功"+ bl3);


    }

    /*
    File类遍历(文件夹)目录功能
        - public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        - public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

    注意:
        list方法和listFiles方法遍历的是构造方法中给出的目录
        如果构造方法中给出的目录的路径不存在,会抛出空指针异常
        如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
 */
    private static void  show4File(){

           /*
        public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有的文件/文件夹,把文件/文件夹封装为File对象,多个File对象存储到File数组中
     */
        File file4 = new File("/Volumes/DataValue2/Basic_study_Java/");
        File[] files = file4.listFiles();
        for (File file : files) {
            System.out.println(file);

        }
           /*
        public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
        遍历构造方法中给出的目录,会获取目录中所有文件/文件夹的名称,把获取到的多个名称存储到一个String类型的数组中
     */
        File file5 = new File("/Volumes/DataValue2/Basic_study_Java/");
        String[] files5 = file5.list();
        for (String s : files5) {
            System.out.println(s);
        }

    }
}
