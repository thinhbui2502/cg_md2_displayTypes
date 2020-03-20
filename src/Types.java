import java.util.Scanner;

public class Types {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (4 types)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice!");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        //Chọn 1
        if (choice == 1) {
            for (int i = 0; i < 3; i++) {
                System.out.println();
                for (int j = 0; j <= 6; j++) {
                    System.out.print("* ");
                }
            }
        }
        //Chọn 2
        if (choice == 2) {
            for (int i = 1; i <= 6; i++) {
                System.out.println();
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

            for (int i = 6; i >= 1; i--) {
                System.out.println();
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

            for (int i = 1; i <= 6; i++) {
                for (int j = 1; j <= 6; j++) {
                    if (j < i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            System.out.println();

            for (int i = 1; i <= 6; i++) {
                for (int j = 6; j >= 1; j--) {
                    if (j <= i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        //Chọn 3
        if (choice == 3) {
            for (int i = 1; i < 6; i++) {
                for (int j = 6; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
        //Chọn 4
        if (choice == 4) {
            System.out.println("Good choice!");
        }
    }
}
