import java.util.Scanner;

 

public class RepeatingBreakingAndRemembering {

 

    public static void main(String[] args) {

        

        // This exercise is worth five exercise points, and it is 

        // gradually extended part by part.

        

        // If you want, you can send this exercise to the server

        // when it's just partially done. In that case the server will complain about 

        // the parts you haven't done, but you'll get points for the finished parts.

        

        Scanner scanner = new Scanner(System.in);

 

        System.out.println("Give numbers:");

		int result = 0;

		int inputCount = 0;

		int evenCount = 0;

		int oddCount = 0;

		

		while (true) {

			int userNumber = Integer.valueOf(scanner.nextLine());

			

			if (userNumber < 0) {

				break;

			}

			

			if (userNumber % 2 == 0) {

				evenCount++;

			}

			

			if (userNumber % 2 != 0) {

				oddCount++;

			}

			

			inputCount++;

			result += userNumber;

		}

		

		

		System.out.println("Thx! Bye!");

		System.out.println("Sum " + result);

		System.out.println("Numbers: " + inputCount);

		System.out.println("Average: " + ((double) result / inputCount));

		System.out.println("Even: " + evenCount);

		System.out.println("Odd " + oddCount);

    }

}
