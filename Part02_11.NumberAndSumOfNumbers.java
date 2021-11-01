import java.util.Scanner;

 

public class NumberAndSumOfNumbers {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        int inputNum = 0;

        int addedNum = 0;

 

        while (true) {

            System.out.println("Give a number:");

            int userInput = Integer.valueOf(scanner.nextLine());

            

            if (userInput == 0) {

                break;

            }

 

            inputNum += 1;

            addedNum += userInput;

        }

 

        System.out.println("Number of numbers: " + inputNum);

        System.out.println("Sum of the numbers: " + addedNum);

    }

}
