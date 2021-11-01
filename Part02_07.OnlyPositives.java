import java.util.Scanner;

 

public class OnlyPositives {

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        

        while (true) {

            System.out.println("Give a number:");

            int user = Integer.valueOf(scanner.nextLine());

 

            if (user == 0) {

                break;

            }

 

            if (user < 0) {

                System.out.println("Unsuitable number");

                continue;

            } else {

                System.out.println(user * user);

            }

        }

    }

}
