package CISC3160.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class interpreter {
    public static void main(String[] args) throws FileNotFoundException {
        String message = " ";
        //String[] store;
        File file = new File("E://GitHub//CISC3160//project//inputOne.txt");
        Scanner scan = new Scanner(file);
        while(scan.hasNextLine()) {
            message = message.concat(scan.nextLine());
        }
        for(int i = 0; i < message.length(); i++) {
            
        }
        System.out.println(message);
        scan.close();
    }

    public static void isDight() {

    }

    public static void nonZeroDight() {

    }

    public static void literal() {

    }

}
