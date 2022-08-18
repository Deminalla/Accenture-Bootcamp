public class Copy {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 13, 27};
        int[] array2 = new int[4];
        for(int i = 1; i<= array1.length; i++){
            array2[i-1] = array1[i-1];
            System.out.println(array2[i-1]);
        }
    }
}
//2) Declare and initialize an array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
