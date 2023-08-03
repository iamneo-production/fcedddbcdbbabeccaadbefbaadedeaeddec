package utility;
import utility.StringAdvanceMethod;
import utility.StringMethod;
import utility.StringBoolean;

public class Main {
    public static void main(String[] args){
        if (args.length != 3) {
            System.out.println("Please provide two input arguments: Input1 and Input2");
            return;
        }
        String Input = args[0];
        String Input1 = args[1];
        String Input2 = args[2];
        
        StringAdvanceMethod sam = new StringAdvanceMethod();
        sam.setInput1(Input1);
        sam.setInput2(Input2);
        System.out.println("Concatenated string: " + sam.concat(Input1, Input2));
        System.out.println("Split string: " + sam.split(Input1, Input2));
        System.out.println("First character: " + sam.firstChar(Input1));
        System.out.println("Index of string: " + sam.indexOf(Input1, Input2));
        System.out.println("Trimmed string: " + sam.trim(Input1));

        
        StringMethod stringMethod = new StringMethod();
        stringMethod.setInput(Input);

        System.out.println("Lowercase string: " + stringMethod.lower(Input));
        System.out.println("Uppercase string: " + stringMethod.upper(Input));
        System.out.println("First character: " + stringMethod.firstCharacter(Input));
        System.out.println("String length: " + stringMethod.length(Input));
        System.out.println("Trimmed string: " + stringMethod.trim(Input));

        
        StringBoolean stringBoolean = new StringBoolean();
        stringBoolean.setInput1(Input1);
        stringBoolean.setInput2(Input2);

        System.out.println("String 1 contains string 2? " + stringBoolean.contains(Input1, Input2));
        System.out.println("String starts with 'He'? " + stringBoolean.startsWith(Input1, Input2));
        System.out.println("String ends with 'He'? " + stringBoolean.endsWith(Input1, Input2));
        System.out.println("Strings are equal? " + stringBoolean.equals(Input1, Input2));
        System.out.println("Strings are equal ignoring case? " + stringBoolean.equalsIgnoreCase(Input1, Input2));

    }
    
}




