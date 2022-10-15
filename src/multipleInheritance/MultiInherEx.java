package multipleInheritance;

class Animal implements AnimalEat, AnimalTravel
{
public void eat()
{
System.out.println("Animal is Eating");
}
public void travel()
{
System.out.println("Animal is Travelling");
}
}
public class MultiInherEx {
public static void main(String[] args) {
Animal a = new Animal();
a.eat();
a.travel();
}}



