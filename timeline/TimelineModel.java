package timeline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TimelineModel {

    public static void main(String[] args) {

        Component c = new Component();

        c.author = "";
        c.year = 1998;

    }

    public static void writeComponentToFile(Component c) {

        PrintWriter fileWriter = null;
        try {

            java.io.File nameFile = new java.io.File("namesInClass.txt");

            fileWriter = new PrintWriter(nameFile);
            fileWriter.println(c.author);
            fileWriter.println(c.year);
            fileWriter.println("Mr.Chen");
            fileWriter.println(fileWriter);
            fileWriter.flush();
            fileWriter.close();
            
           } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } finally {
            fileWriter.close();
        } // end of try catch
        
        
   
    } // end of method 
   
    public static Component extractComponentFromFile() {

    File nameFile = new java.io.File("namesInClass.txt");
    
    

    Scanner fileScanner = new Scanner(nameFile);

    fileScanner.useDelimiter ("\n");
    
    System.out.println ( "Delim");

    System.out.println (fileScanner.next());

    
    System.out.println (fileScanner.next());

 
    System.out.println (fileScanner.next());

   
    System.out.println (fileScanner.next());
        
    return null;

            
           
  

    } // end of method 

    
      public static Component getEventFromFile() {

    File addEvent = new java.io.File("addEvent.txt");

       try {
           Scanner fileScanner = new Scanner(addEvent);
       } catch (FileNotFoundException ex) {
         System.out.println(ex);
       }
    
       System.out.println("Year, Model Name,  Specs,  2019 Price");
       System.out.println("1970, Intel 1103, 16v power supply, 1kb of dram");
       System.out.println("1975, 2mhz with 256k ram");
       System.out.println("1980, commodore, 2019 price $778.73");
       System.out.println("1992, Think Pad, 2019 price $2375");
       System.out.println("");
       System.out.println("");
       System.out.println("");
       
       return null;
  
       
    } // end of scanner 
    
    
} // end of class
