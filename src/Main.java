import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // [row#][column#]
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;

        numbers[1][0] = 4;
        numbers[1][1] = 5;
        numbers[1][2] = 6;
        System.out.println(Arrays.deepToString(numbers));

        int[][] numbersGp = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(numbersGp));

        // Another way to print out 2D array
        for(int i=0; i<=numbers.length-1; i++){
            for(int j=0; j<=numbers[i].length-1; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
