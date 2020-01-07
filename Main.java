import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("this program will compute the average score of all students");
        String response;
        do
            {
                System.out.println("please enter all non-negative scores");
                System.out.println("Enter a negative score when you done from marks");
                double score = keyboard.nextDouble();
                double sum = 0;
                double average = 0;
                int numberOfStudents = 0;

                while (score >= 0)
                {
                    sum = sum + score;
                    numberOfStudents++;
                    score = keyboard.nextDouble();
                }
                if(numberOfStudents > 0)
                    System.out.println("Average is: " + sum/numberOfStudents);
                else
                    System.out.println("No score to average");

                System.out.println("Do you wanna compute another student score average");
                System.out.println("please enter yes or no");
                response = keyboard.next();
            }while (response.equalsIgnoreCase("yes"));

        System.out.println("thank you and have a good day!");


    }
}
