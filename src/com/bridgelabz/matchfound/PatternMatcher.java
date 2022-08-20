package com.bridgelabz.matchfound;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher {
    public static void main(String[] args) {

        Pattern pattern =Pattern.compile("talib",Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher("My Name Is Talib");

        boolean matchFound=matcher.find();

        if (matchFound){
            System.out.println("Match Found");
        }else{
            System.out.println("Match Not Found !!");
        }
    }
}
