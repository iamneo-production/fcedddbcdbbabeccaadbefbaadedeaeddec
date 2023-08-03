package utility;

public class StringBoolean {
//	Enter the code here....
private String input1;
    private String input2;

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }
    public boolean containsString(String input12, String input22) {
        return input1.contains(input2);
    }

    public boolean startsWithLetter(char letter) {
        if (input1.isEmpty()) {
            return false;
        } else {
            return input1.charAt(0) == letter;
        }
    }

    public boolean endsWithLetter(char letter) {
        if (input1.isEmpty()) {
            return false;
        } else {
            return input1.charAt(input1.length() - 1) == letter;
        }
    }
    public boolean areEqual() {
        return input1.equals(input2);
    }

    public boolean areEqualIgnoreCase() {
        return input1.equalsIgnoreCase(input2);
    }

	public char[] containsString() {
		return null;
	}

	public boolean endsWithLetter(String input12, String input22) {
		return false;
	}

	public boolean startsWithLetter(String input12, String input22) {
		return false;
	}

	public boolean arerEqual(String input12, String input22) {
		return false;
	}

	public boolean areEqual(String input12, String input22) {
		return false;
	}

	public boolean areEqualIgnoreCase(String input12, String input22) {
		return false;
	}
}