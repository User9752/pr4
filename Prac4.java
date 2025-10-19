

import java.util.Scanner;

public class Prac4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Practical 4: GitHub Demo ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("\nHello, " + name + "!");
        System.out.println("Next year, you will be " + (age + 1) + " years old.");

        sc.close();
    }
}
