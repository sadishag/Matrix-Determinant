package se2s03;

public class Matrix3x3cr {
    
    rows col1;
    rows col2;
    rows col3;
    
    public class rows  {
        public long row1;
        public long row2;
        public long row3;
    }
    
    public Matrix3x3cr(long[] matrixArray) {
        
        if (matrixArray.length != 9) {
            System.out.println("Error: Not a 9 element Array");
        } else {
            col1 = new rows();
            col2 = new rows();
            col3 = new rows();
            
            col1.row1 = matrixArray[0];
            col1.row2 = matrixArray[3];
            col1.row3 = matrixArray[6];
            col2.row1 = matrixArray[1];
            col2.row2 = matrixArray[4];
            col2.row3 = matrixArray[7];
            col3.row1 = matrixArray[2];
            col3.row2 = matrixArray[5];
            col3.row3 = matrixArray[8];
        }
    }
        
    public long determinant() {
        
        return col1.row1 * (col2.row2 * col3.row3 - col3.row2 * col2.row3) - col1.row2 * (col2.row1 * col3.row3 - col3.row1 * col2.row3) + col1.row3 * (col2.row1 * col3.row2 - col3.row1 * col2.row2);
    }    
}
