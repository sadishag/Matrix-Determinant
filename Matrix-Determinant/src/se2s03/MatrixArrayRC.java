package se2s03;

public class MatrixArrayRC {

    long[][] matArray;
    int n;
    
    public MatrixArrayRC(long[] matrixArray, int l) {
        n = (int) Math.sqrt(matrixArray.length);
        
        
        if (Math.sqrt(matrixArray.length) % 1 == 0) {

            matArray = new long[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matArray[i][j] = matrixArray[((i * n) + j)];
                }
            }
        } else {
            System.out.println("Error: array was not a square matrix");
        }
    }
    
    public MatrixArrayRC(long[] matrixArray) {
        n = (int) Math.sqrt(matrixArray.length);
        
        
        if (Math.sqrt(matrixArray.length) % 1 == 0) {

            matArray = new long[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matArray[i][j] = matrixArray[((i * n) + j)];
                }
            }
        } else {
            System.out.println("Error: array was not a square matrix");
        }
    }
    
public MatrixArrayRC getWithoutRowCol(int row, int col) {
        
        int newR = 0;
        int newC = 0;
        long[][] newArray = new long[(n-1)][(n-1)];
        
        for (int r = 0; r<n; r++) {
            if  (r == row) {continue;}
            for (int c =0; c<n; c++) {
                if (c == col) {continue;}
                newArray[newR][newC] = matArray[r][c];
                newC++;
                }
            
            newC = 0;
            newR++;
        }
        return convert2DTo1D(newArray);
    }
    
    public MatrixArrayRC convert2DTo1D (long [][] array) {
        int length = array.length;
        long[] newArray = new long[length*length];
        
        for (int x = 0; x<length; x++) {
            for (int y = 0; y<length; y++) {
                newArray[x*length + y] = array[x][y];
            }
        }
        return new MatrixArrayRC(newArray);
    }
    
    public long determinant() {
        long det = 0;
        
        if (n == 1) {return matArray[0][0];}
        
        for (int r = 0; r<n; r++) {
                MatrixArrayRC newMatrix = getWithoutRowCol(r,0);
                long value = matArray[r][0]*newMatrix.determinant();
                if (r%2 == 0)
                    det += value;
                else
                    det -= value;
        }
        return det;    
    }
}
//Worked with Ed Guolien 