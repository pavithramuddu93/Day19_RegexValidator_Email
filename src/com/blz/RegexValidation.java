package com.blz;
import java.util.regex.Pattern;
public class RegexValidation {

    static public boolean isValid(String regex,String input) {
        Pattern pattern= Pattern.compile(regex);
        return pattern.matches(regex,input);

    }
    public static void main(String[] args) {
        boolean regexCheck = isValid("^[a-z]{1,10}[@][a-z]{1,10}$","karthik@bridgelabz");
        System.out.println(regexCheck);
    }
}