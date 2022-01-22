import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

//import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


//
//<!-- https://mvnrepository.com/artifact/com.opencsv/opencsv -->
//<dependency>
//<groupId>com.opencsv</groupId>
//<artifactId>opencsv</artifactId>
//<version>5.5.2</version>
//</dependency>
//<dependency>
//<groupId>net.sf.opencsv</groupId>
//<artifactId>opencsv</artifactId>
//<version>2.0</version>
//<scope>test</scope>
//</dependency>
//FOR CSV
public class WriterCSV {

    public static void main(String[] args) throws IOException {

        String[] bookHeader = {"BookName", "Author of the book"};
        String[] bookName1 = {"BookName1", "Author1"};
        String[] bookName2 = {"BookName2", "Author2"};
        String[] bookName3 = {"BookName3", "Author3"};
        String[] bookName4 = {"BookName4", "Author4"};

        List<String[]> s = new ArrayList<String[]>();
        s.add(bookHeader);
        s.add(bookName1);
        s.add(bookName2);
        s.add(bookName3);
        s.add(bookName4);

        FileOutputStream outputStream = new FileOutputStream("src/main/resources/N11TestData.csv");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        //CSVWriter writer = new CSVWriter(outputStreamWriter);
        //writer.writeAll(s);
        //writer.close();
        outputStreamWriter.close();
        outputStream.close();
    }
}
