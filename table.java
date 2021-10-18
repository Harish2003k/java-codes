import java.util.Scanner;
class Table{
    public static void main(String args[]){
         System.out.println("********Code Start to Run*********");
        System.out.println("Enter The Number:");
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println("Table of Number is:"+n*i);
        }
        System.out.println("********Successfull*********");
    }
}