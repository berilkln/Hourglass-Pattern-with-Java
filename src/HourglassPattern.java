import java.util.Scanner;

public class HourglassPattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.print("Enter initial star number(Write 'q' to quit): ");
            String character = scan.nextLine();

            if(character.equals("q")) {           //if the entered character is q, the program terminates.
                System.out.print("Program Terminates.");
                System.exit(0);
            }

            else {

                int n = Integer.parseInt(character);       //if not, string value is converted to integer value.


                if (n % 2 == 0) { //valid case if the entered number is even

                    for(int i=1; i<=n; i= i +2) {
                        for(int a=0; a<=i-1; a++) {
                            System.out.print(" ");
                        }

                        for(int j = 0; j <= (n - i); j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }

                    for(int i=n ; i>=1; i= i-2) {
                        for(int a=1; a<=i-1; a++) {
                            System.out.print(" ");
                        }

                        for(int j=i-1 ; j<=(n); j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }


                }
                else {  //valid case if the entered number is odd

                    for(int i=1; i<=n; i= i+2) {
                        for(int a=0; a<=i-1; a++) {
                            System.out.print(" ");
                        }

                        for(int j = 0; j <= (n - i); j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }

                    for(int i=n ; i>1; i= i-2) {
                        for(int a=0; a<=i-3; a++) {
                            System.out.print(" ");
                        }

                        for(int j=i ; j<=(n+2); j++) {
                            System.out.print(" *");
                        }
                        System.out.println();
                    }


                }
            }
        }
    }
}
