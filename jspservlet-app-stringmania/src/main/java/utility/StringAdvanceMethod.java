package utility;

public class StringAdvanceMethod {
	//Enter the code here...
	private String input1;
	private String input2;

	public String getInput1(){
		return input1;
	}
	public void setInput1(String input1){
		this.input1 = input1;
	}

	public String getInput2(){
		return input2;
	}
	public void setInput2(String input2){
		this.input2 = input2;
	}
	public String concatenateStrings(String input1, String input2){
		return input1.concat(input2);
	}
	public String[] splitStrings(String input1, String input2){
		return input1.split(input2);
	}
	public char findFirstCharacter() {
        return input1.charAt(0);
    }
    
    public int findIndexOf(String input1, String input2) {
        return input1.indexOf(input2);
    }
    
    public String trimInputString() {
        return input1.trim();
    }
}