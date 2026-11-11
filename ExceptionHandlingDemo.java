import java.util.Scanner;

class ExceptionHandlingDemo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("enter numerator:");
            int a=sc.nextInt();
            System.out.println("enter denominator:");
            int b=sc.nextInt();
            int result=a/b;
            System.out.println("result="+result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception:cannot divide by zero.");
        }
        finally{
            System.out.println("Finally block is executed.");
        }
        sc.close();
    }
}
