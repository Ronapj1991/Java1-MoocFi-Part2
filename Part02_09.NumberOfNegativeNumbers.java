import java.util.Scanner;

 

public class NumberOfNegativeNumbers {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        int negativeCount = 0;

 

        while (true) {

            System.out.println("Give a number:");

            int user = Integer.valueOf(scanner.nextLine());

 

            if (user == 0) {

                break;

            }

 

            if (user < 0) {

                negativeCount += 1;

            }

        }

 

        System.out.println("Number of negative numbers: " + negativeCount);

    }

}
