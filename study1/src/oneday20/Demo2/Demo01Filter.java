package oneday20.Demo2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo01Filter {

    public static void main(String[] args) {
        File files = new File("/Volumes/DataValue2/Basic_study_Java/");
        getAllFiles(files);

    }

    public static void getAllFiles(File dir){
        File[] files = dir.listFiles(new FileterImpl());//传递过滤器对象
            for (File file : files) {
                if (file.isDirectory()){
                    getAllFiles(file);
                }else {
                    System.out.println(file);
                }
            }

        }

}
