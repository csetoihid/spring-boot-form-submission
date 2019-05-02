package operation;

import java.util.HashSet;

public class Form {
    private String content;
    public char repeatedChar;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;  
        String strNoSpace = content.replaceAll("\\s","");
        String str = strNoSpace.toUpperCase(); 
        char[] arr = str.toCharArray(); 
        this.repeatedChar = repeatingFirstChar(arr);   
    }

    
    // Find out the first repeated Char from String 
    static char repeatingFirstChar(char str[]) 
    { 
        // defined empty HashSet
        HashSet<Character> h = new HashSet<>(); 
        // Traverse the characters 
        for (int i=0; i<=str.length-1; i++) 
        { 
            char c = str[i];
            // If element is already in hash set, update x 
            // and then break 
            if (h.contains(c)) 
                return c; 
            else // Else add element to hash set 
                h.add(c); 
        } 
        return '\0'; 
    }     
    
    
    
    
}
