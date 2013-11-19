package se2s03;

public class Matrix3x3flat {
    long a11;
    long a12;
    long a13;
    long a21;
    long a22;
    long a23;
    long a31;
    long a32;
    long a33;
    
    public Matrix3x3flat(long[] matrixArray) {
        
        if (matrixArray.length != 9) {
            System.out.println("Error: Not a 9 element Array");
        } else {
            a11 = matrixArray[0];
            a12 = matrixArray[1];
            a13 = matrixArray[2];
            a21 = matrixArray[3];
            a22 = matrixArray[4];
            a23 = matrixArray[5];
            a31 = matrixArray[6];
            a32 = matrixArray[7];
            a33 = matrixArray[8]; 
        }
    }
    public long determinant() {
        
        return a11 * (a22 * a33 - a32 * a23) - a12 * (a21 * a33 - a31 * a23) + a13 * (a21 * a32 - a31 * a22);
        
    }
}
