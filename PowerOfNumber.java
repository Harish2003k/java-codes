import java.util.Scanner;
class PowerOFNumber{
    public static void main(String args[]){
        int num;
        int pow;
        int i=1; 
        int sum=1;
        System.out.println("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Enter Power:");
        pow=sc.nextInt();
        while(i <= pow){
            sum=sum*num;
            i++;
        }
        System.out.println("\n"+num+" to the power " +pow+ " is " +sum);
        
    }
}