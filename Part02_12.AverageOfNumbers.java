import java.util.Scanner;

 

public class AverageOfNumbers {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        int inputCount = 0;

        int addedNum = 0;

 

        while (true) {

            System.out.println("Give a number:");

            int user = Integer.valueOf(scanner.nextLine());

            

            if (user == 0) {

                break;

            }

 

        

            inputCount +=  1;

            addedNum += user;

        

        }

 

        if (inputCount == 0) {

            System.out.println("Cannot calculate the average");

        } else {

            System.out.println("Average of the numbers: " + (double) addedNum / inputCount);

        }

    }

}
