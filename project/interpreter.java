package CISC3160.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class interpreter {
    // global variable
    public static char prevChar;
    public static int x, y, z,counter = 0;

    //---------------------------------------------main----------------------------------
    public static void main(String[] args) throws FileNotFoundException {
        String message = "";
        String messageTwo;
        File file = new File("E://GitHub//CISC3160//project//inputOne.txt");
        Scanner scan = new Scanner(file);
        StringBuilder newMessage = new StringBuilder();
        StringBuilder newMessageTwo = new StringBuilder();
        while(scan.hasNextLine()) {
            message = message.concat(scan.nextLine());
        }
        System.out.println(message);
        
        for(int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            if(character == '=') {
                for(int k = i + 1; k < message.length(); k++) {         
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
                        newMessageTwo.setLength(0); // this is working. DONT TOUCH
                        counter++;
                    }
                }
            }
        }
        System.out.println(message);
        scan.close();
    }


    //-----------------------------checking char----------------------------------------
    public static void check(char charScan) {
        if(Character.isDigit(charScan)) {
            if(charScan == '0') {
                if(charScan == prevChar) {
                    errorMessage();
                }
                if(charScan != prevChar) {
                    prevChar = charScan;
                }
            }
            if(counter == 0) {
                x = charScan;
            }
            else if(counter == 1) {
                y = charScan;
            }
            
            else if(counter == 3) {
                calculate(x, y);  
            }
        }
        if(charScan == '%' || charScan == '/' || charScan == '*' || charScan == '+' || charScan == '-') {
            if(charScan == prevChar) {
                errorMessage();
                
            }
            prevChar = charScan;   
        }
        if(charScan == '=' || Character.isLetter(charScan)) {
            errorMessage();
        }
    }


    //--------------------------------error message-------------------------------------
    public static void errorMessage() {
        System.out.println("error!");
        System.exit(0);
    }

    public static void calculate(int x, int y) {

    }
}
