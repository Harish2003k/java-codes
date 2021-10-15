import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Harish kumar gupta");
        String name = scanner.nextLine();
        System.out.println("Gender");
        String gender = scanner.nextLine();
        System.out.println("Age");
        int age = scanner.nextInt();
        System.out.println("You input variable:");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
    }
}