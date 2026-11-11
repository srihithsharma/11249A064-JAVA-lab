class animal{
void eat(){
System.out.println("animal eats food");
}
}
class dog extends animal{
void bark(){
System.out.println("dog barks");
}
}
class cat extends animal{
void meow(){
System.out.println("cat meows");
}
}
public class HierarchicalInheritance{
public static void main(String[] args){
dog d=new dog();
cat c=new cat();
d.eat();
d.bark();
c.eat();
c.meow();
}
}
