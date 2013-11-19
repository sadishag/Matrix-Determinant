package se2s03;

public class MatrixArrayFlat {

    long[] matArray;
    long[] minor = null;
    int n;
    
    public MatrixArrayFlat(long[] matrixArray, int l) {
        n = (int) Math.sqrt(matrixArray.length);
        if (Math.sqrt(matrixArray.length) % 1 == 0) {
            matArray = matrixArray;
        } else {
            System.out.println("Error: array was not a square matrix");
        }
        
    }
    
    // Record to create the reference to 1D array
    public MatrixArrayFlat(long[] matrixArray) {
        n = (int) Math.sqrt(matrixArray.length);
        if (Math.sqrt(matrixArray.length) % 1 == 0) {
            matArray = matrixArray;
        } else {
            System.out.println("Error: array was not a square matrix");
        }
        
    }
    
    public long get(int x, int y) {
        return matArray[x*n + y];
    }
    
    public MatrixArrayFlat getWithoutRowCol(int row, int col)
    {
        int newR = 0;
        int newC = 0;
        long[] newArray = new long[(n-1)*(n-1)];
        
        for(int r = 0; r<n ; r++) {
            if (r == row) {continue;}
            for(int c = 0 ; c<n ; c++) {
                if (c == col) {continue;}
                newArray[newR*(n-1)+newC] = get(r,c);
                newC++;
            }
            newC = 0;
            newR++;
        }
        return new MatrixArrayFlat(newArray);
    }
    
    
    public long determinant() {
        long det = 0;
        
        if (n == 1) { return matArray[0]; }
        
        for (int r = 0; r<n; r++) {
            MatrixArrayFlat newMatrix = getWithoutRowCol(0,r);
            long value = get(0, r)*newMatrix.determinant();
            if (r%2 == 0)
                det += value;
            else
                det -= value;
        }
        return det; 
    }
}

//Source of algorithm: https://github.com/mirhagk/matrixreducer
//Worked with Ed Guolien 
