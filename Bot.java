import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
public class Bot {
    public static void main(String[] args){
        LocalDate tempDate = LocalDate.now();
        String currYear = String.valueOf(tempDate);
        System.out.println("Hello my name is Scrap!");
        System.out.println("I was created in " + currYear.substring(0,4) + ".");
        System.out.println("Please remind me of your name again?");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.println("What a great name you have, " + userName + "!");
        System.out.println("Let me guess your age?");
        System.out.println("Enter the remainders of dividing your age by 3,5, and 7");
        int remainder3 = input.nextInt();
        int remainder5 = input.nextInt();
        int remainder7 = input.nextInt();
        //some calculations in the bg
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + " ,that's a good age to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int countTo = input.nextInt();
        for (int i = 0; i <= countTo; i++) {
            System.out.println(i+"!");
        }
        System.out.println("Told you!");
        System.out.println("Let's test your programming knowledge.");
        System.out.println("When was java created?");
        System.out.println("1. 1994");
        System.out.println("2. 1995");
        System.out.println("3. 1996");
        System.out.println("4. 1997");
        int answer = input.nextInt();
        if (answer != 3) {
            System.out.println("No, the correct answer was 1996");
        } else {
            System.out.println("Correct");
        }
        System.out.println("Have a nice day!");

    }
}
