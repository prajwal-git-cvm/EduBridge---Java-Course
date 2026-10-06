import java.util.Scanner;

public class Employee {

    static String name;
    static int age;
    static double salary;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    while (true) {
                        System.out.print("Enter your name: ");
                        name = sc.nextLine();

                        System.out.print("Enter your age: ");
                        age = sc.nextInt();

                        System.out.print("Are you satisfied with the details? (y/n): ");
                        char answer = sc.next().charAt(0);
                        sc.nextLine();

                        if (answer == 'y' || answer == 'Y') {
                            break;
                        }
                    }

                    System.out.print("Enter your salary: ");
                    salary = sc.nextDouble();
                    break;

                case 2:
                    System.out.println("\n--- Employee Details ---");
                    System.out.println("Name   : " + name);
                    System.out.println("Age    : " + age);
                    System.out.println("Salary : " + salary);
                    break;

                case 3:
                    System.out.print("Enter salary raise amount: ");
                    double raise = sc.nextDouble();

                    salary = salary + raise;

                    System.out.println("Salary raised successfully!");
                    System.out.println("New Salary: " + salary);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
