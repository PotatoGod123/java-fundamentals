/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        readFile("app/src/main/resources/gates.js");
    }

    public static void readFile(String stringFilePath){
        File jsFile= new File(stringFilePath);

        Scanner jsScanner;

        try{
            jsScanner = new Scanner(jsFile);
        } catch (FileNotFoundException exception){
            System.out.println("Could not find files");
            return;
        }
        String textLine;
        int counter=0;

        while(jsScanner.hasNextLine()){
            counter++;
            final String currentLine= jsScanner.nextLine();
            System.out.println(currentLine);
            if(currentLine.contains("}")||currentLine.contains("{")||currentLine.contains("if")||currentLine.contains("else")||currentLine.isBlank()||currentLine.contains(";")||currentLine.contains("//")){
                //match
            }else{

                System.out.println("Line "+counter+":Missing semicolon");
            }


        }

    }
}
