package oneday20.Demo2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileterImpl implements  FileFilter {

    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }


}
