package CISC3160.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class interpreter {
    public static void main(String[] args) throws FileNotFoundException {
        //int counter = 0;
        String message = " ";
        //String[] store;
        File file = new File("E://GitHub//CISC3160//project//inputOne.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            message = message.concat(scan.nextLine());
            //message.charAt()
        }
        for(int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            if(character == ';') {
                /*store[counter] = message;
                counter++;*/
                
            }
        }
        System.out.println(message);
        scan.close();
    }

    public static void Dight() {

    }

    public static void nonZeroDight() {

    }

    public static void literal() {

    }

}
