public class FinalizeExample {
   public static void main(String[] args)  
    {  
	   FinalizeExample s1=new FinalizeExample();   
        s1 = null;  
      System.gc();  
      System.out.println("Garbage collection is called");  
    }  
    @Override  
    protected void finalize()  
    {  
        System.out.println("Finalize method is called");  
    }  }