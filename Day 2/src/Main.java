import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // input stream

        //compareIntegers(input);
        //compareBoolean(input);
        //evenOrOdd1(input);
        //evenOrOdd2(input);
        //booleanOpposite(input);
        //integerTrue(input);

        input.close();
    }

    static void compareIntegers (Scanner input) {
        System.out.print("Enter value a: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print("Enter value b: ");
        int b = Integer.parseInt(input.nextLine());

        System.out.println("is " + a + " equal to " + b + " ? - " + (a==b));
        System.out.println("is " + a + " less than " + b + " ? - " + (a<b));
        System.out.println("is " + a + " less or equal to " + b + " ? - " + (a<=b));
        System.out.println("is " + a + " greater than " + b + " ? - " + (a>b));
        System.out.println("is " + a + " greater or equal to " + b + " ? - " + (a>=b));
    }

    static void compareBoolean (Scanner input) {
        System.out.print("Enter b1: ");
        boolean b1 = Boolean.parseBoolean(input.nextLine());

        System.out.print("Enter b2: ");
        boolean b2 = Boolean.parseBoolean(input.nextLine());

        System.out.println("Is " + b1 + " and " + b2 + " equal? - " + (b1==b2));
    }

    static void evenOrOdd1 (Scanner input) {
        System.out.print("Enter a whole number: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.println("Is " + number + " even? - " + (number%2==0));
    }

    static void evenOrOdd2 (Scanner input) {
        System.out.print("Enter a whole number: ");
        int number = Integer.parseInt(input.nextLine());

        System.out.println("Is " + number + " even? - " + (number%2!=0));
    }

    static void booleanOpposite (Scanner input) {
        System.out.print("Enter boolean value: ");
        boolean value = Boolean.parseBoolean(input.nextLine());

        System.out.println("The opposite of " + value + " is " + !value);
    }

    static void integerTrue (Scanner input) {
        System.out.print("Enter value a: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print("Enter value b: ");
        int b = Integer.parseInt(input.nextLine());

        if((a==b) || (a<0 && b>0) || (a>100 && b>100)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}