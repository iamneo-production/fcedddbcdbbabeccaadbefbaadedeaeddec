package utility;

import java.util.*;

public class Main{
    public static void main(String[] args, Object String){
            // Iteration 1
            StringAdvanceMethod sam = new StringAdvanceMethod();
            sam.setInput1("Hello");
            sam.setInput2("World");
            System.out.println(sam.concatenateStrings(null,null)); // Output: HelloWorld
            System.out.println(Arrays.toString(sam.splitStrings(null, null))); // Output: [Hello, World]
            System.out.println(sam.findFirstCharacter()); // Output: H
            System.out.println(sam.findIndexOf("l","p")); // Output: 2
            System.out.println(sam.trimInputString()); // Output: Hello
        
            // Iteration 2
            StringMethod sm = new StringMethod();
            sm.setInput("Hello World");
            System.out.println(sm.toLowerCase()); // Output: hello world
            System.out.println(sm.toUpperCase()); // Output: HELLO WORLD
            System.out.println(sm.findFirstCharacter()); // Output: H
            System.out.println(sm.stringLength()); // Output: 11
            System.out.println(sm.trimInput()); // Output: Hello World
        
            // Iteration 3
            StringBoolean sb = new StringBoolean();
            sb.setInput1("Hello World");
            sb.setInput2("lo");
            System.out.println(sb.containsString()); // Output: true
            System.out.println(sb.startsWithLetter('H')); // Output: true
            System.out.println(sb.endsWithLetter('d')); // Output: true
            System.out.println(sb.areEqual()); // Output: false
            System.out.println(sb.areEqualIgnoreCase()); // Output: true
        }
}