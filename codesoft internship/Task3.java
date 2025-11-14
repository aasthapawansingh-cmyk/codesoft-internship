import java.util.Scanner;

class ATM{
    float bal;
    int pin=8752;
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc =new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("enter a vallid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("enter your choice");
        System.out.println("1. check a/c bal");
        System.out.println("2. withdraw money");
        System.out.println("3. deposit money");
        System.out.println("4. exit");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            checkbalance();
        }
        else if(opt==2)
        {
         withdrawmoney();
        }
        else if(opt==3){
             depositmoney();
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("enter a vallid choice");
        }
           
        }
        public void checkbalance(){
            System.out.println("Balance:"+ bal);
            menu();
        }
        public void withdrawmoney(){
            System.out.println("enter amount to withdraw:");
            Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            if(amount>bal){
                System.out.println("insuffiecient balance");
            }
            else{
                bal=bal-amount;
                System.out.println("money withdrawn successfully");
            }
            menu();

        }
        public void depositmoney(){
            System.out.println("enter the amount");
           Scanner sc=new Scanner(System.in);
            float amount=sc.nextFloat();
            bal=bal+amount;
            System.out.println("money deposited successfully");
            menu();
        }
    }




public class Task3 {
    public static void main(String[] args) {
        ATM obj= new ATM();
        obj.checkpin();
    }
    
}
