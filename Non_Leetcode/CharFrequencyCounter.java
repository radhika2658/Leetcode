// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    String S = "Radhikaaaaa";
    int count = 0;
    
    for(int i =0; i<=S.length()-1; i++)
    {
         char C = S.charAt(i);
    
        if (C =='a')
        count++;
        
    }
    System.out.print(count);
    }
}
