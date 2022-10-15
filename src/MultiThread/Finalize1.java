package MultiThread;

public class Finalize1 {
    public static void main(String[] args)
   {
String str1 = new String("CS"); //passing string so o/p one came
       str1 = null; //obj as null

      System.gc();
       System.out.println("output of main method");
}
protected void finalize()
   {
       System.out.println("output of finalize method");
   }
}
