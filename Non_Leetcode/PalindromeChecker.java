// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
     String S = "abbaa";
     String reverse = "";
     
     for(int i=S.length()-1; i>=0; i--)
     
     {
         char C = S.charAt(i);
         reverse = reverse + C;
     
    
     }
      if (reverse.equals(S))
     {
         System.out.println("yes");
         System.out.println(reverse);
     }
         else
         {
         System.out.print("no");
         }
    
    // System.out.print(reverse);
     
    }
}
