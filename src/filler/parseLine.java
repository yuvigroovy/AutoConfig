package filler;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class parseLine {
    private String line;

    public parseLine(String line) {
        this.changeLine(line);
    }

    public String line() {
        return this.line;
    }

    public void changeLine(String line) {
        this.line = line;
    }

    public ArrayList<String> getBlanks () {
        Matcher regex = new Matcher();
    }
}
