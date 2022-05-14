package CISC3160.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class interpreter {
    // global variable
    public static char y;

    //---------------------------------------------main----------------------------------
    public static void main(String[] args) throws FileNotFoundException {
        //int counter = 0;
        String message = "";
        String messageTwo;
        //line;
        //String[] store;
        File file = new File("E://GitHub//CISC3160//project//inputOne.txt");
        Scanner scan = new Scanner(file);
        StringBuilder newMessage = new StringBuilder();
        StringBuilder newMessageTwo = new StringBuilder();
        while(scan.hasNextLine()) {
            message = message.concat(scan.nextLine());
            //message.charAt()
        }

        System.out.println(message);
        
        for(int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            if(character == '=') {
                for(int k = i + 2; k < message.length(); k++) {         
                    newMessage.append(message.charAt(k));    
                }
                messageTwo = newMessage.toString();
                for(int j = 0; j < messageTwo.length(); j++) {
                    char characterTwo = messageTwo.charAt(j);
                    newMessageTwo.append(characterTwo);
                    if(characterTwo == ';') {
                        for(int c = 0; c < newMessageTwo.length(); c++) {
                            char charScan = newMessageTwo.charAt(c);
                            check(charScan);
                        }
                        newMessage.setLength(0); // this is working. DONT TOUCH
                    }
                }
            }
        }
        System.out.println(message);
        scan.close();
    }


    //-----------------------------checking char----------------------------------------
    public static void check(char charScan) {
        /*for(int i = 0; i < charScan.length(); i++) {
            char character = charScan.charAt(i);
        }*/
        //System.out.println(charScan);
        if(Character.isDigit(charScan)) {
            //System.out.println("testing");
            if(charScan == '0') {
                if(charScan == y) {
                    errorMessage();
                }
                if(charScan != y) {
                    y = charScan;
                }
            }
            //y = charScan;   
        }
        if(charScan == '%' || charScan == '/' || charScan == '*' || charScan == '+' || charScan == '-') {
            //System.out.println("testing");
            if(charScan == y) {
                errorMessage();
                
            }
            y = charScan;   
        }
    }


    //--------------------------------error message-------------------------------------
    public static void errorMessage() {
        System.out.println("error!");
        System.exit(0);
    }

    /*public static void Dight() {

    }

    public static void nonZeroDight() {

    }

    public static void literal() {

    }*/
// this program works for x = 001; , x_2 = 0.
}
