package utility;
import java.util.Arrays;
public class StringAdvanceMethod {
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

	public String concat(String input1,String input2){
		return input1.concat(input2);
	}
	public String split(String input1,String input2){
		String[] str=input1.split(input2);
		return Arrays.toString(str);
	}
	public String firstChar(String input1){
		char first=input1.charAt(0);
		return Character.toString(first);
	}
	public String indexOf(String input1,String input2){
		String[] inputs=new String[2];
		inputs[0]=String.valueOf(input1.indexOf("j"));
		inputs[1]=String.valueOf(input2.indexOf("j"));
		return Arrays.toString(inputs);
	}
	public String trim(String input1){
		return input1.trim();
	}
}
