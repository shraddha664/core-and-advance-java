package org.example.abstract_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class NumberExtractReport extends ExtractorReport {
    private static final Pattern PATTERN=Pattern.compile("^[0-9]*$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

}
