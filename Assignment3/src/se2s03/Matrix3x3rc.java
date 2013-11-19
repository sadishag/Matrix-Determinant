package se2s03;

public class Matrix3x3rc {
    
    columns row1;
    columns row2;
    columns row3;
    
    public class columns  {
        public long col1;
        public long col2;
        public long col3;
    }
    
    public Matrix3x3rc(long[] matrixArray) {
        
        if (matrixArray.length != 9) {
            System.out.println("Error: Not a 9 element Array");
        } else{
            row1 = new columns();
            row2 = new columns();
            row3 = new columns();
            
            row1.col1 = matrixArray[0];
            row1.col2 = matrixArray[1];
            row1.col3 = matrixArray[2];
            row2.col1 = matrixArray[3];
            row2.col2 = matrixArray[4];
            row2.col3 = matrixArray[5];
            row3.col1 = matrixArray[6];
            row3.col2 = matrixArray[7];
            row3.col3 = matrixArray[8];
        }
    }
        
    public long determinant() {
        
        return row1.col1 * (row2.col2 * row3.col3 - row3.col2 * row2.col3) - row1.col2 * (row2.col1 * row3.col3 - row3.col1 * row2.col3) + row1.col3 * (row2.col1 * row3.col2 - row3.col1 * row2.col2);
        
    }
}
