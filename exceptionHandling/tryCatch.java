package java.exceptionHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class tryCatch{
    public static void main(String[] args){
        String text = "sust - cse";

        try{
            System.out.println("Entered in try block");
            Files.writeString(Path.of("file.txt"), text, 
                StandardOpenOption.WRITE); 
        } catch(IOException e){
            System.out.println("Entered in catch block");
            //e.printStackTrace();
            
        }
    }
} 