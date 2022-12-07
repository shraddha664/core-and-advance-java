package org.example.regex_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String regexStr=".*[a-z][0-9][a-z].";
        Pattern pattern=Pattern.compile(regexStr);

        Matcher matcher=pattern.matcher("12346574cbvncdncmuye833");
        boolean matchFound=matcher.find();
        if (matchFound){
            System.out.println("Match Found");
        }
        else {
            System.out.println("match not found");
        }

    }
}
