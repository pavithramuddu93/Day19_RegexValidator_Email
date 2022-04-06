package com.blz;
import java.util.regex.Pattern;
public class RegexValidation {

    static public boolean isValid(String regex,String input) {
        Pattern pattern= Pattern.compile(regex);
        return pattern.matches(regex,input);

    }
    public static void main(String[] args) {
        boolean regexCheck = isValid("^([a-z]{1,10})$","charan");
        System.out.println(regexCheck);
    }
}