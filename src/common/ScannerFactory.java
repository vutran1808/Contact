/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ScannerFactory {

    private Scanner SCANNER;

    public Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }

    public int getInt() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[\\d]+")) {
                break;
            }
        }
        return Integer.parseInt(input);
    }

    public String getString() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("^[a-zA-Z\\s]+")) {
                break;
            } else {
                System.out.println("Invalid String");
            }
        }
        return input;
    }

    public String getPhone() {
        String input;
        while (true) {
            input = getScanner().nextLine();
            if (input.matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|(?:\\d{3}-){2}\\d{4} [a-z]+\\d{4}|\\(?(\\d{3}-)\\)?(?:\\d{3}-){1}\\d{4}|(?:\\d{3}.){2}\\d{4}|(?:\\d{3} ){2}\\d{4}")) {
                break;
            } else {
                System.out.println("Please input Phone flow");
                System.out.println("""
                                   1234567890
                                   123-456-7890 
                                   123-456-7890 x1234
                                   123-456-7890 ext1234
                                   (123)-456-7890
                                   123.456.7890
                                   123 456 7890""");
            }
        }
        return input;
    }
}
