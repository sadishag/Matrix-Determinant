package se2s03;

public class Program {
    
    public static void main(String[] args) {
        
        long[] matArray = new long[] {6,1,1,4,-2,5,2,8,7};
        
        MatrixArrayFlat matrix = new MatrixArrayFlat(matArray);
        MatrixArrayRC matrixRC = new MatrixArrayRC(matArray);
        MatrixArrayCR matrixCR = new MatrixArrayCR(matArray);
        
        System.out.println(matrix.determinant());
        System.out.println(matrixRC.determinant());
        System.out.println(matrixCR.determinant());
    }

}
