package fileio;

import java.io.File;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String directoryName="D:\\Maverics\\Training\\Spring-Boot\\Day-2";
        File directory=new File(directoryName);
        if(directory.isDirectory()){
            System.out.println("It is a directory");
        }
        else if(directory.exists()){
            System.out.println("Directory exist");
        }else{
            directory.mkdir();
        }

        String fileName="D:\\Maverics\\Training\\Spring-Boot\\Day-2\\greet.txt";
        File file=new File(fileName);
        try{
            file.createNewFile();
            System.out.println(file.isFile());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getName());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.lastModified());
            System.out.println(file.delete());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
