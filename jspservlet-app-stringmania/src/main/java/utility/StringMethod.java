package utility;

public class StringMethod {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String lower(String input) {
        return input.toLowerCase();
    }

    public String upper(String input) {
        return input.toUpperCase();
    }

    public String firstCharacter(String input) {
        return String.valueOf(input.charAt(0));
    }

    public int length(String input) {
        return input.length();
    }

    public String trim(String input) {
        return input.trim();
    }
}
