
package readwrite;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.*;
import java.nio.*;
import static java.nio.file.StandardOpenOption.*;

public class write {

    public static void main(String[] args) {
        Path file = Paths.get("C:\\Documents\\NetBeansProjects\\readout\\fileout.txt");
        String s = "ABCDF";
        
        byte[] data = s.getBytes();
        OutputStream output = null;
        
        try{
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch (Exception e){
        System.out.println("Message: " + e);
        }
                
    }
    
}
