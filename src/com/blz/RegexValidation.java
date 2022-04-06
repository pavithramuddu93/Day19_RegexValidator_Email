package com.blz;
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegexValidation {

    static public boolean isValid(String regex,String input) {
        Pattern pattern= Pattern.compile(regex);
        return pattern.matches(regex,input);

    }
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter the emails to test\n");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.next();
            boolean regexCheck = isValid("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
                    + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$", email);
            System.out.println(regexCheck);
        }
    }
}