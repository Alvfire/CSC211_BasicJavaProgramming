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
    }
}
