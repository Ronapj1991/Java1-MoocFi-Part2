public class AdvancedAstrology {

 

    public static void printStars(int number) {

        // part 1 of the exercise

        for (int x = 0; x < number; x++) {

            System.out.print("*");

		}

        System.out.println("");

    }

 

    public static void printSpaces(int number) {

        // part 1 of the exercise

        int space = 0;

		

		while (space < number) {

			System.out.print(" ");

			space++;

		}

    }

 

    public static void printTriangle(int size) {

        // part 2 of the exercise

        int numberOfStar = 1;

		int numberOfSpace = size - 1;

		

		while (numberOfStar <= size) {

			printSpaces(numberOfSpace);

			printStars(numberOfStar);

			

			numberOfStar++;

			numberOfSpace--;

		}

    }

 

    public static void christmasTree(int height) {

        // part 3 of the exercise

        int star = 1;

		int space = height - 1;

		int baseSpace = height - 2;

 

		while (height > 0) {

			printSpaces(space);

			printStars(star);

			

			height--;

			star += 2;

			space --;

		}

		

		//base

		for (int base = 0; base < 2; base ++) {

			printSpaces(baseSpace);

			printStars(3);

		}

    }

 

    public static void main(String[] args) {

        // The tests are not checking the main, so you can modify it freely.

 

        printTriangle(5);

        System.out.println("---");

        christmasTree(4);

        System.out.println("---");

        christmasTree(10);

    }

}
