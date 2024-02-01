package JavaBasics;

public class Main {
    public static void main(String[] args) {

        // Variables
        int age = 25;
        double salary = 50000.0;
        String name = "John";

        // For loop: A for loop repeats a block of code a specified number of times.
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        /* While loop: A while loop continues executing a block of code as
        long as a condition is true */
        int count=0;
        while(count<3){
            System.out.println("Count: "+count);
            count++;
        }

        /* Do-While Loop: A do-while loop executes the code block at least once
        before checking the condition */
        int num=1;
        do{
            System.out.println("Number: "+num);
            num++;
        }while(num<=3);

        // Conditional Statements

        //If statement:
        int x = 10;
        if(x>5){
            System.out.println("X is greater than 5");
        }

        //If-Else Statement:
        int num1=7;
        if (num1 % 2 == 0) {
            System.out.println("Even");
        }else
        {
            System.out.println("Odd");
        }

        //Nested if-Else:
        int urage = 18;
        if (urage>=18) {
            if (urage < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You are eligible for everything");
            }
            }
            else
            {
                System.out.println("You're not eligible");
            }

        // Switch case:
        //Multi-choice decision using switch-case

        int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
               //....
                default:
                    System.out.println("Invalid day");
            }
        }
    }

