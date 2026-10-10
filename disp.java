

import java.util.Scanner;

class disp1 {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public disp1(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;

        switch (designation.toUpperCase()) {
            case "P20":
                this.salary = 20000;
                break;
            case "M30":
                this.salary = 30000;
                break;
            case "T25":
                this.salary = 25000;
                break;
            default:
                this.salary = 15000;
                break;
        }
    }

    public void display() {
        System.out.println("your name is " + name);
        System.out.println("your age is " + age);
        System.out.println("your salary " + salary);
        System.out.println("your desgination is " + designation);
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }
}

public class disp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        disp1 emp = null;

        while (true) {
            System.out.println("\n1)Create 2) Display 3) Raise salary 4) Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("1.Enter the name: ");
                    String name = sc.nextLine();

                    System.out.print("2.Enter the age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("3.Enter the designation(P20/M30/T25): ");
                    String desig = sc.nextLine();

                    emp = new disp1(name, age, desig);
                    break;

                case 2:
                    if (emp != null) {
                        emp.display();
                    } else {
                        System.out.println("No employee data found.");
                    }
                    break;

                case 3:
                    if (emp != null) {
                        System.out.print("Enter raise amount: ");
                        double raise = sc.nextDouble();
                        emp.raiseSalary(raise);
                    } else {
                        System.out.println("No employee data found.");
                    }
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}