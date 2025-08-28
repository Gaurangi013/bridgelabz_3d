import java.util.Scanner;

public class level1 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int choice;
            
            while (true) {
                System.out.print("Enter ques number: ");
                choice = input.nextInt();
                
                if (choice == 0) {
                    System.out.println("Exiting program. Goodbye!");
                    break;
                }
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter a number: ");
                        int num = input.nextInt();
                        System.out.println("Is the number " + num + " divisible by 5? " + (num % 5 == 0));
                    }
                    case 2 -> {
                        System.out.print("Enter first number: ");
                        int n1 = input.nextInt();
                        System.out.print("Enter second number: ");
                        int n2 = input.nextInt();
                        System.out.print("Enter third number: ");
                        int n3 = input.nextInt();
                        System.out.println("Is the first number the smallest? " + (n1 < n2 && n1 < n3));
                    }
                    case 3 -> {
                        System.out.print("Enter first number: ");
                        int n1 = input.nextInt();
                        System.out.print("Enter second number: ");
                        int n2 = input.nextInt();
                        System.out.print("Enter third number: ");
                        int n3 = input.nextInt();
                        int max = Math.max(n1, Math.max(n2, n3));
                        System.out.println("Is the first number the largest? " + (n1 == max));
                        System.out.println("Is the second number the largest? " + (n2 == max));
                        System.out.println("Is the third number the largest? " + (n3 == max));
                    }
                    case 4 -> {
                        System.out.print("Enter a number: ");
                        int n = input.nextInt();
                        if (n >= 0) {
                            int sum = n * (n + 1) / 2;
                            System.out.println("The sum of " + n + " natural numbers is " + sum);
                        } else {
                            System.out.println("The number " + n + " is not a natural number");
                        }
                    }
                    case 5 -> {
                        System.out.print("Enter age: ");
                        int age = input.nextInt();
                        if (age >= 18) {
                            System.out.println("The person's age is " + age + " and can vote.");
                        } else {
                            System.out.println("The person's age is " + age + " and cannot vote.");
                        }
                    }
                    case 6 -> {
                        System.out.print("Enter a number: ");
                        int number = input.nextInt();
                        if (number > 0) {
                            System.out.println("Positive");
                        } else if (number < 0) {
                            System.out.println("Negative");
                        } else {
                            System.out.println("Zero");
                        }
                    }
                    case 7 -> {
                        System.out.print("Enter month (1-12): ");
                        int month = input.nextInt();
                        System.out.print("Enter day: ");
                        int day = input.nextInt();
                        boolean spring = (month == 3 && day >= 20)
                                || (month == 4)
                                || (month == 5)
                                || (month == 6 && day <= 20);
                        System.out.println(spring ? "Its a Spring Season" : "Not a Spring Season");
                    }
                    case 8 -> {
                        System.out.print("Enter countdown start number: ");
                        int counter = input.nextInt();
                        while (counter >= 1) {
                            System.out.println(counter);
                            counter--;
                        }
                        System.out.println("Lift Off!");
                    }
                    case 9 -> {
                        System.out.print("Enter countdown start number: ");
                        int count = input.nextInt();
                        for (int i = count; i >= 1; i--) {
                            System.out.println(i);
                        }
                        System.out.println("Lift Off!");
                    }
                    case 10 -> {
                        double total = 0;
                        while (true) {
                            System.out.print("Enter a number (0 to stop): ");
                            double val = input.nextDouble();
                            if (val == 0) {
                                break;
                            }
                            total += val;
                        }
                        System.out.println("The total is " + total);
                    }
                    case 11 -> {
                        double total = 0;
                        while (true) {
                            System.out.print("Enter a number (0 or negative to stop): ");
                            double val = input.nextDouble();
                            if (val <= 0) {
                                break;
                            }
                            total += val;
                        }
                        System.out.println("The total is " + total);
                    }
                    case 12 -> {
                        System.out.print("Enter a natural number: ");
                        int n = input.nextInt();
                        if (n >= 0) {
                            int formula = n * (n + 1) / 2;
                            int sum = 0, i = 1;
                            while (i <= n) {
                                sum += i;
                                i++;
                            }
                            System.out.println("Formula result: " + formula);
                            System.out.println("While loop result: " + sum);
                            System.out.println("Both results match? " + (formula == sum));
                        } else {
                            System.out.println("Not a natural number!");
                        }
                    }
                    case 13 -> {
                        System.out.print("Enter a natural number: ");
                        int n = input.nextInt();
                        if (n >= 0) {
                            int formula = n * (n + 1) / 2;
                            int sum = 0;
                            for (int i2 = 1; i2 <= n; i2++) {
                                sum += i2;
                            }
                            System.out.println("Formula result: " + formula);
                            System.out.println("For loop result: " + sum);
                            System.out.println("Both results match? " + (formula == sum));
                        } else {
                            System.out.println("Not a natural number!");
                        }
                    }
                    case 14 -> {
                        System.out.print("Enter a number: ");
                        int n = input.nextInt();
                        if (n >= 0) {
                            long fact = 1;
                            int i3 = 1;
                            while (i3 <= n) {
                                fact *= i3;
                                i3++;
                            }
                            System.out.println("Factorial of " + n + " is " + fact);
                        } else {
                            System.out.println("Not a natural number!");
                        }
                    }
                    case 15 -> {
                        System.out.print("Enter a number: ");
                        int n = input.nextInt();
                        if (n >= 0) {
                            long fact = 1;
                            for (int i4 = 1; i4 <= n; i4++) {
                                fact *= i4;
                            }
                            System.out.println("Factorial of " + n + " is " + fact);
                        } else {
                            System.out.println("Not a natural number!");
                        }
                    }
                    case 16 -> {
                        System.out.print("Enter a natural number: ");
                        int n = input.nextInt();
                        if (n > 0) {
                            for (int i5 = 1; i5 <= n; i5++) {
                                if (i5 % 2 == 0) {
                                    System.out.println(i5 + " is Even");
                                } else {
                                    System.out.println(i5 + " is Odd");
                                }
                            }
                        } else {
                            System.out.println("Not a natural number!");
                        }
                    }
                    case 17 -> {
                        System.out.print("Enter salary: ");
                        double salary = input.nextDouble();
                        System.out.print("Enter years of service: ");
                        int years = input.nextInt();
                        if (years > 5) {
                            double bonus = salary * 0.05;
                            System.out.println("Bonus amount is " + bonus);
                        } else {
                            System.out.println("No bonus");
                        }
                    }
                    case 18 -> {
                        System.out.print("Enter a number: ");
                        int n = input.nextInt();
                        for (int i6 = 6; i6 <= 9; i6++) {
                            System.out.println(n + " * " + i6 + " = " + (n * i6));
                        }
                    }
                    
                    default -> System.out.println("Invalid choice! Try again.");
                }
                // Q1
                // Q2
                // Q3
                // Q4
                // Q5
                // Q6
                // Q7
                // Q8
                // Q9
                // Q10
                // Q11
                // Q12
                // Q13
                // Q14
                // Q15
                // Q16
                // Q17
                // Q18
            }
        }
    }
}
    