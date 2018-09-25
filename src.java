# Game
that's even and odd game between computer and human
import java.util.*;
public class Bo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Let’s play a game called “Odds and Evens”");

        System.out.print("What is your name? ");

        String NAME = s.nextLine();

        System.out.print("Hi " + NAME + " , which do you choose? (O)dds or (E)vens?");

        String choice = s.next();

        if (choice.equalsIgnoreCase("o")) {

            System.out.println(NAME + " has picked odds! The computer will be evens.");

            process(NAME,choice);

        } else if (choice.equalsIgnoreCase("E")) {

            System.out.println(NAME + " has picked evens! The computer will be odds.");

            process(NAME,choice);

        } else {

            System.out.println("this is not a choice ,try again and choose one of the options! ");

        }
    }
        public static void process(String name,String Bo){

        Scanner s1 = new Scanner(System.in);

        System.out.print("How many “fingers” do you put out?");

        int num = s1.nextInt();

        Random rand = new Random();

        int computer = rand.nextInt(6);

        System.out.println("The computer plays "+ computer +"“fingers”.");

        int sum = computer+num;

        boolean oddOrEven = sum%2==0;

        System.out.println(num+"+"+computer+" = "+sum);

        if(oddOrEven){

            System.out.println("the number is...even!");

        }
            else{

            System.out.println("the number is...odd!");

        }
            if(Bo.equalsIgnoreCase("e")&oddOrEven){

            System.out.println("that means "+name+" wins!:)");

        }else if(Bo.equalsIgnoreCase("o")&!oddOrEven){
                System.out.println("that means "+name+" winss!:)");

            }

        else{
                System.out.println("that means computer wins!:)");
            }
    }
}
