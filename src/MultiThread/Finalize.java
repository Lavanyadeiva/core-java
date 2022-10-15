package MultiThread;

public class Finalize {
    public static void main(String[] args)
   {
Finalize str2 = new Finalize (); //keywrd finalize used so both r executing
 str2 = null; 
      System.gc();
      System.out.println("output of main method");
}
protected void finalize()
   {
       System.out.println("output of finalize method");
   }
}


