package CISC3160.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class interpreter {
    public static void main(String[] args) throws FileNotFoundException {
        //int counter = 0;
        String message = "";
        //line;
        //String[] store;
        File file = new File("E://GitHub//CISC3160//project//inputOne.txt");
        Scanner scan = new Scanner(file);
        StringBuilder newMessage = new StringBuilder();
        while(scan.hasNextLine()) {
            message = message.concat(scan.nextLine());
            //message.charAt()
        }
        for(int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            newMessage.append(character);
            if(character == ';') {
                System.out.println("testing"); // this is working DONT TOUCH
                //line = newMessage;
                System.out.println("line is: " + newMessage);
                /*for(int j = 0; j < line.length(); j++) {
                    char charScan = line.charAt(i);
                    check(charScan);
                }*/
                newMessage.setLength(0); // this is working. DONT TOUCH
                
            }
        }
        System.out.println(message);
        scan.close();
    }

    public static void check(char charScan) {
        /*for(int i = 0; i < charScan.length(); i++) {
            char character = charScan.charAt(i);
        }*/
        if(Character.isDigit(charScan)) {
            System.out.println("testing");
        }
    }



    /*public static void Dight() {

    }

    public static void nonZeroDight() {

    }

    public static void literal() {

    }*/

}
