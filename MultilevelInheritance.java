
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
class puppy extends dog{
void play(){
System.out.println("puppy plays");
}
}
public class MultilevelInheritance{
public static void main(String[] args){
puppy p=new puppy();
p.eat();
p.bark();
p.play();
}
}
