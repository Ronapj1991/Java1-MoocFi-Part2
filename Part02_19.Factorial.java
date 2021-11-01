 

import java.util.Scanner;

 

public class Factorial {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

 

		int start = 1;

		int result = 1;

		

		System.out.println("Give a number");

		int end = Integer.valueOf(scanner.nextLine());

		

		while (start <= end) {

			result *= start;

			start++;

		}

		

		System.out.println("Factorial: " + result);

    }

}
