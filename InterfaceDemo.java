interface bank{
    void deposit(double amount);
    void withdraw(double amount);
    void displaybalance();
}
class account implements bank{
    int accountno;
    String name;
    double balance;
    account (int accountno,String name,double balance)
    {
        this.accountno=accountno;
        this.name=name;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("amount deposited :"+amount);
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;
            System.out.println("amount withdrawn:"+amount);
        }else{
            System.out.println("insufficient balance");
        }
    }
    public void displaybalance(){
        System.out.println("account number:"+accountno);
        System.out.println("account holder:"+name);
        System.out.println("current balance:"+balance);
    }
}
public class InterfaceDemo{
    public static void main(String[] args){
        account obj=new account(101,"arun",5000);
        System.out.println(".....account details...");
        obj.displaybalance();
        System.out.println("\n.....deposit.....");
        obj.deposit(2000);
        obj.displaybalance();
        System.out.println("\n.... withdrawal.....");
        obj.withdraw(1500);
        obj.displaybalance();
    }
}
