import java.util.Scanner;

/**
 * Class which creates triangle matrix, fills it and display on the screen
 */
public class TriangleMatrix {
    private int a;
    private int b;

    /**
     * Constructor of triangle matrix
     * Check values that will be basis of matrix
     */
    TriangleMatrix(){
        while (b <= a) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите целое число A:");
            this.a = in.nextInt();
            System.out.println("Введите целое число B(B>A):");
            this.b = in.nextInt();
            if(b>a) break;
            else {
                System.out.println("Вы ввели некорректные значения.Введите значения заново: ");
            }
        }
    }

    /**
     * Creates triangle matrix
     * All elements are 0
     * @return triangle matrix with 0 elements
     */
    private int[][] triangleMatrixCreator(){
        int[][] triangleMatrix = new int[b-a+1][];

        for(int i = 0;i<b-a+1;i++){
            triangleMatrix[i] = new int[i+a];
        }
        return triangleMatrix;
    }

    /**
     * Fills the matrix
     * @param triangleMatrix - triangle matrix  with 0 elements
     * @return triangle matrix that fills with elements
     */
    private int[][] fillMatrix(int[][] triangleMatrix){
        for(int i = 0; i<triangleMatrix.length;i++){
            for(int j=0;j<triangleMatrix[i].length;j++){

                triangleMatrix[i][j]=i+a;
            }
        }
        return  triangleMatrix;
    }

    /**
     * Displays the matrix on the screen
     */
    public void displayMatrix(){
        for (int[] row : fillMatrix(triangleMatrixCreator())){
            for(int value:row){
                System.out.printf("%4d",value);
            }
            System.out.println();
        }
    }

}
