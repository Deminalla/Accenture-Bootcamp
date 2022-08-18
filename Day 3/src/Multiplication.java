public class Multiplication {

    public static void main(String[] args) {
        int [][] array = new int[10][10];

        for(int i=1; i<=10; i++){
            for(int j=1; j<=10;j++){
                array[i-1][j-1] = j*i;
                System.out.println(i + " * " + j + " = " + array[i-1][j-1]);
            }
        }

    }
}

/*
/1) Write a program which creates two dimensional
// array and stores a multiplication table (from 1 - 10) in it.
    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100
    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]
 */