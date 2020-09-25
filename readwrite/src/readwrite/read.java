package readwrite;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class read {

    Path file = Paths.get("C:\\Documents\\NetBeansProjects\\readout\\filein.txt");
    InputStream input = null;

    
        try{
        input = Files.newInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        String s = null;
        s = reader.readLine();
        System.out.println(s);
        input.close();
    }
        catch (IOException e){
            System.out.println(e);
        }
}
