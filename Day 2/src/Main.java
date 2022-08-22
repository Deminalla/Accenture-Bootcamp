import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // input stream


        //compareIntegers(input);

        System.out.print("Enter b1: ");
        boolean b1 = Boolean.parseBoolean(input.nextLine());
        System.out.print("Enter b2: ");
        boolean b2 = Boolean.parseBoolean(input.nextLine());
        //compareBoolean(b1, b2);

        System.out.print("Enter a whole number: ");
        int number1 = Integer.parseInt(input.nextLine());
        //evenOrOdd1(number1);

        System.out.print("Enter a whole number: ");
        int number2 = Integer.parseInt(input.nextLine());
        //evenOrOdd2(number2);

        System.out.print("Enter boolean value: ");
        boolean value = Boolean.parseBoolean(input.nextLine());
        //booleanOpposite(value);

        System.out.print("Enter value a: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print("Enter value b: ");
        int b = Integer.parseInt(input.nextLine());
        //integerTrue(a, b);

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

    static boolean compareBoolean (boolean b1, boolean b2) {
        System.out.println("Is " + b1 + " and " + b2 + " equal? - " + (b1==b2));
        return (b1==b2);
    }

    static boolean evenOrOdd1 (int number1) {
        System.out.println("Is " + number1 + " even? - " + (number1%2==0));
        return (number1%2==0);
    }

    static boolean evenOrOdd2 (int number2) {
        System.out.println("Is " + number2 + " even? - " + (number2%2!=0));
        return (number2%2!=0);
    }

    static boolean booleanOpposite (boolean value) {
        System.out.println("The opposite of " + value + " is " + !value);
        return !value;
    }

    static boolean integerTrue (int a, int b) {
        if((a==b) || (a<0 && b>0) || (a>100 && b>100)) {
            System.out.println("true");
            return true;
        }
        else{
            System.out.println("false");
            return false;
        }
    }
}