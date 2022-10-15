
class Books{ 
 
void run()
{
System.out.println("Book not in stock");
} 
} 

class Hello_World extends Books{
void run()
{
System.out.println("Book is available");
}
public static void main(String[] args) {
Books obj = new Books(); 
Hello_World obj1 = new Hello_World(); 
 
obj.run();
obj1.run();
}
}
