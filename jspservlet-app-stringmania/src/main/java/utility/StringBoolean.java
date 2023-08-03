package utility;

public class StringBoolean {
    private String input1;
	private String input2;

	public String getInput1(){
		return this.input1;
	}
	public void setInput1(String input1){
		this.input1=input1;
	}
	public String getInput2(){
		return this.input2;
	}
	public void setInput2(String input2){
		this.input2=input2;
	}

    public Boolean contains(String input1, String input2){
        return input1.contains(input2);
    }
    public Boolean startsWith(String input1,String input2){
        if(input1.startsWith("a") && input2.startsWith("j")){
            return true;
        }
        return false;
    }
    public Boolean endsWith(String input1,String input2){
        if(input1.endsWith("a") && input2.endsWith("j")){
            return true;
        }
        return false;
    }
    public Boolean equals(String input1,String input2){
        return input1.equals(input2);
    }
    public Boolean equalsIgnoreCase(String input1,String input2){
        return input1.equalsIgnoreCase(input2);
    }

}
