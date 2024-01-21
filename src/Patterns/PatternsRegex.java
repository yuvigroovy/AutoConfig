package Patterns;

public class PatternsRegex {
    protected static final String FILL_REGEX = 
    protected static final String BYTE_REGEX = "^([1-2][0-5][0-5]|[0-9][0-9]|[1-9])$";
    protected static final String IPV4_REGEX = BYTE_REGEX + "\\." + BYTE_REGEX + "\\." + BYTE_REGEX + "\\." + BYTE_REGEX;
}
