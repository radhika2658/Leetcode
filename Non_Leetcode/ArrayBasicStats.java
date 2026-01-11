// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
      int array[] = {3,7,5};
      int max = 0;
      int avg = 0;
      int count = array.length;
      
      for (int i =0; i<array.length; i++)
      {
          max = max + array[i];
          avg = (max/count);
      }
      System.out.println(max);
      System.out.println(avg);
      
    }
}
