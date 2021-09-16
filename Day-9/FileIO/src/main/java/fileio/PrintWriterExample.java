package fileio;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class PrintWriterExample {
    public static void main(String[] args){

        String fileName =  "D:\\Maverics\\Training\\Spring-Boot\\Day-2\\greetings.txt";
        File file = new File(fileName);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(fileName,true));
            Person p1 = new Person("Rakesh",32,"Chennai");
            Person p2 = new Person("Rajesh",25,"Hyderabad");
            Person p3 = new Person("Ritu",33,"Pune");
            Person p4 = new Person("Rakul",27,"Mumbai");

            List<Person> persons = new ArrayList<>();
            persons.add(p1);
            persons.add(p2);
            persons.add(p3);
            persons.add(p4);
            for(Person person: persons) {
                printWriter.print(person);
                // printWriter.write(person);
            }
            // printWriter.println("Hello IO Stream");
            //printWriter.append("Hello IO Stream");
            printWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            //List<Person> personList = new ArrayList<>();
            String currentPerson = null;

            while((currentPerson = bufferedReader.readLine())!=null) {
                System.out.println(currentPerson);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
