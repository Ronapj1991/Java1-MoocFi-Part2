import java.util.Scanner;

 

public class CountingToHundred {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        int userNum = Integer.valueOf(scanner.next());

 

        while (userNum <= 100) {

            System.out.println(userNum);

            userNum++;

        }

    }

}
