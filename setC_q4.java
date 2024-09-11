import java.util.Scanner;
public class setC_q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of row and columns of matrix");
        int row = s.nextInt();
        int cols = s.nextInt();
        int[][] matrix = new int[row][cols];

        System.out.println("Enter the element of matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.println("original matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int[][] transpose = new int[cols][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose matrix:");
        for(int i=0;i<cols;i++){
            for(int j=0;j<row;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
