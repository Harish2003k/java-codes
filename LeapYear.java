import java.util.Scanner;
class LeapYear{
    public static void main(String args[]){
        int year;
        System.out.println("Enter the YEAR:");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year%400==0){
            System.out.println(year+" is a leap year");
        }
        else if(year%100==0){
            System.out.println(year+" is not a leap year");
        }
        else if(year%4==0){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}