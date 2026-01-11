// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    String S = "java programming";
    String output = "";
    
    for(int i=S.length()-1;i>=0;i--)
    {
       char character = S.charAt(i);
        
        if(character!=' ')
        {
    
     output = output + character ;
        }
  
    }
    System.out.print(output);
    }
}
