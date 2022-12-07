package org.example.abstract_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {
    public  abstract Pattern getPattern();
    public abstract String getReportName();
    private String parse(String path)throws FileNotFoundException{
//        Pattern pattern=Pattern.compile("^[0-9]*$");
        String out="";
        File file=new File(path);
        Scanner scanner=new Scanner(file);
        if (scanner.hasNext()){
            scanner.nextLine();
        }else {
            return  "Empty File";
        }
        while (scanner.hasNext()){
            String nextLine=scanner.nextLine();
            Matcher matcher=getPattern().matcher(nextLine);

            boolean matches=matcher.matches();
            if (matches){
                out+=nextLine+"\n";
            }
        }
        return out.isBlank()?"Empty File ":out;

    }
    public void prepareAndSendReport(String path) throws FileNotFoundException{
            System.out.println("starting report:"+getReportName()+"...");
            String report=parse(path);
            System.out.println(report);
            System.out.println("send report :"+getReportName()+"...");
        }
    }

