package fileio;

import com.sun.jndi.toolkit.url.UrlUtil;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ReadingFromURL {
    public static void main(String[] args)  {
        try {
            URL url = new URL("http://www.google.com:80/");
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();

        }



        //read file from zip file

        // Name of the zip file
        String fileName = "D:\\Maverics\\Training\\business-price-indexes-march-2021-quarter-csv.zip";
        try (FileInputStream fis = new FileInputStream(fileName);
             BufferedInputStream bis = new BufferedInputStream(fis);
             ZipInputStream zis = new ZipInputStream(bis)) {
            ZipEntry ze;
            //Buffer to store content
            byte[] buffer = new byte[2048];
            //Output path where I want to write the content of zip file
            Path outDir = Paths.get("D:\\Maverics\\Training\\output\\");
            while ((ze = zis.getNextEntry()) != null) {
                System.out.println(ze.getName()); // display name of zip file
                System.out.println(ze.getSize()); // display size of zip file
                Path filePath = outDir.resolve(ze.getName());
                try (FileOutputStream fos = new FileOutputStream(filePath.toFile());
                     BufferedOutputStream bos = new BufferedOutputStream(fos, buffer.length)) {
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        bos.write(buffer, 0, len);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
