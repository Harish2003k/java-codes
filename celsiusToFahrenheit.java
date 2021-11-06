import java.util.Scanner;
class PowerOFNumber{
    public static void main(String args[]){
      float c;
      float f;
      System.out.println("Enter temp in centigrade:");
      Scanner sc=new Scanner(System.in);
      c=sc.nextFloat();
      f=(float)((1.8*c)+32);
      System.out.println("Temperature in fahrenhiet ="+f);
          }
}