import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring a variable for switch expression
        Scanner s = new Scanner(System.in);

        String number= s.next();
        //Switch expression
        switch(number){
            //Case statements
            case "A":
            {
                System.out.println("I am the first letter");
                break;
            }

            case "B":
            {
                System.out.println("I am the second letter");
                break;}
            case "C":
            {
                System.out.println("I am the third letter");
                break;}
            case "D":
            {
                System.out.println("I am the fourth letter");
                break;}
            case "E":
            {
                System.out.println("I am the fifth letter");
                break;}
            //Default case statement
            default:
            {
                System.out.println("I don't belong here");
            }
        }
    }
}  