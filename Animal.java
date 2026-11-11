class Animal{
    final void sound(){
        System.out.println("Animal make sounds:");
    }
}
class FinalMethodDemo{
    public static void main(String[]args){
        Animal a=new Animal();
        a.sound();
    }
}
