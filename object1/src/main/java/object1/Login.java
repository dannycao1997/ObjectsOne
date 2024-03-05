package object1;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        System.out.println("Please enter password!");
        Scanner scanner = new Scanner(System.in);
        String password = "1234";


        int a = 3;
        int i = 0;
        while (i < 4) {
            String login = scanner.next();

            if (password.equals(login)) {

                System.out.println("Welcome");
                break;
            } else {

                System.out.println("You have " + a + " try!");

                if (i == 3) {
                    System.out.println("System locked please wait 3 minutes");
                }
            }
            a--;
            i++;
        }


    }


}


