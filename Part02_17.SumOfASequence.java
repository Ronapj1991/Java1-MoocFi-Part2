import java.util.Scanner;

 

public class SumOfASequence {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

        int start = 1;

		int result = 0;

		

		System.out.println("Last number?");

		int end = Integer.valueOf(scanner.nextLine());

		

		while (start <= end) {

			result += start;

			start++;

		}

		

		System.out.println("The sum is " + result);

    }

}
