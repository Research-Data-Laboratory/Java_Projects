package createfile.templates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static createfile.templates.Create.*;
//TODO: set Scanner for patternInput

public class SearchPattern {
    public static void searchPattern() {
        final String patternInput = "\\[Created at";
        Pattern pattern = Pattern.compile(patternInput);
        Matcher matcher = pattern.matcher(Create.listOfFiles.getName() + inputFileName);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Found Pattern");
        } else {
            System.out.println("No Pattern was matched");
        }
    }
}