package Patterns;

public enum Patterns {
    FILL(),
    BYTE(PatternsRegex.BYTE_REGEX),
    IPV4(PatternsRegex.IPV4_REGEX);

    private String regex;

    Patterns(String regex) {
        this.setRegex(regex);
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}
