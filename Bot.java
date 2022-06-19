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

    }
}
