import java.util.Scanner;
public class BankingApplication
{
    public static void main(String args[])
    {
        BankAccount obj1 =new BankAccount("ArtiBank","BA0001");
        obj1.showMenu();
    }
}
class BankAccount
{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    BankAccount(string cname,String cid)
    {
        customerName = cname;
        customerId = cid;
    }
    void deposit(int amount)
    {
        if(amount !=0)
        {
            balance =balance+amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount)
    {
        if(amount !=0)
        {
            balance =balance - amount;
            previousTransaction =- amount;
        }
    }
    void getpreviousTransaction()
    {
        if(previoustransaction >0)
        {
            System.out.println("Deposited: "+previousTransaction);
        }
        else if
        {
        System.out.println("Withdraw:"+Math.abs(previousTransaction));    
        }
        else
        {
            System.out.prinln("No Transaction occured");
        }
    }
    void showmenu
    {
        char option ='\0';
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome "+customerName);
         System.out.println("Your ID is "+customerId);
          System.out.println("\n");
           System.out.println("A. Check Balance");
            System.out.println("B. Deposit Balance");
             System.out.println("C. Withdraw Balance");
              System.out.println("D.Previous Transaction");
               System.out.println("E.Exit");
    
        do
        {
             System.out.println("========================================");
              System.out.println("Enter the option");
               System.out.println("=======================================");
               option = scanner.next().charAt(0);
                System.out.println("\n");
                switch(option)
                {
                    case 'A':
                         System.out.println("-----------------------------");
                          System.out.println("Balance ="+balance);
                           System.out.println("-----------------------------");
                            System.out.println("\n");
                            break;
                            case 'B':
                   System.out.println("-------------------------");
                     System.out.println("Enter the amount to deposit:");
                       System.out.println("------------------------");
                         int amount =scanner.nextInt();
                         deposit(amount);
                          System.out.println("\n");
                          break;
                          case 'C':
                               System.out.println("----------------------");
                                System.out.println("Enter the amount to withdraw:");
                                 System.out.println("-----------------------");
                                 int amount2 =scanner.nextInt();
                                 withdraw(amount2);
                                  System.out.println("\n");
                                  break;
                                  case 'D':
                           System.out.println("-------------------");
                        getpreviousTransaction();
                         System.out.println("------------------------");
                          System.out.println("\n");
                          break;
                          case 'E':
                               System.out.println("*********************");
                               break;
                          default:
                           System.out.println("Invalid Option ! Please Enter Again");
                           break;
                }
        }
        while(option !='E');
         System.out.println("Thank You For Using Our Services");
    }

    
    
    
    
    
    
    
    
    
    
    
    