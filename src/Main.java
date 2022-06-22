
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ranNumber = (int) (Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess the number between 1-100 : ");
            userNumber = sc.nextInt();
            if (userNumber == ranNumber){
                System.out.println("VOILA!!!!....YOU GUESSED IT CORRECT..!!! :)");
                break;
            }
            else if (userNumber>ranNumber){
                System.out.println("NUMBER TOO LARGE!!!! :( ");
            }
            else {
                System.out.println("NUMBER TOO SMALL!!!! :( ");
            }
        }while(userNumber >= 0);
        System.out.print("NUMBER WAS : ");
        System.out.println(ranNumber);



    }
}