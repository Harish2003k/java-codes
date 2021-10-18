import java.util.Scanner;
class UserInput
{
    public static void main(String args[])
    {
        System.out.println("Enter Emp_ID Emp_Name Emp_Sex Emp_Salary:");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        String name=sc.next();
        char gender=sc.next().charAt(0);
        int salary=sc.nextInt();
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Sex:"+gender);
        System.out.println("Employee Salary:"+salary);
        
    }
}