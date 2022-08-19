import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input {
    public static void main (String[]args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = input.readLine();
        System.out.println("Your name is: " + name);
    }
}
