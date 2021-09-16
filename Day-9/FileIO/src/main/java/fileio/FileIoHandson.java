package fileio;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class FileIoHandson {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a directory name: ");
        String directoryName = s.nextLine();
        File directory=new File(directoryName);

        if(directory.isDirectory()){
            System.out.println("It is a directory");
        }
        else if(directory.exists()){
            System.out.println("Directory exist");
        }else{
//            directory.mkdir();
            System.out.println("Cirectory not exist");
        }

        File file=new File(directoryName);

        System.out.println("-------------------------------------------------------");
        System.out.println("Number of list  present in file  is " + file.listFiles().length);

        System.out.println("-------------------------------------------------------");
        System.out.println("list  are ");
        String[] fileList = file.list();
        for(String str : fileList) {
            System.out.println(str);
        }

        System.out.println("-------------------------------------------------------");
        long date= file.lastModified();
        DateFormat sdf
                = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");

        System.out.println("modified date is : "
                + sdf.format(date));

        System.out.println("-------------------------------------------------------");
        System.out.println("Size in mb is " +getFileSizeMegaBytes(file));
        }

        private static String getFileSizeMegaBytes(File file) {
        return (double) file.length() / (1024 * 1024) + " mb";


    }
}
