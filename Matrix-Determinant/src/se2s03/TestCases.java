package se2s03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

    @Test
    public void test() {
        
        long[] array1 = new long[] {6,1,1,4,-2,5,2,8,7}; //-306
        long[] array2 = new long[] {1,2,3,4,5,6,7,8,8}; //3
        long[] array3 = new long[] {-1,-2,-3,-4,-5,-6,-7,-8,8}; //-51
        long[] array4 = new long[] {4,-8,-9,5,8,7,43,32,-1}; //-1720
        long[] array5 = new long[] {1,1,1,-11,3,1,1,1,0}; //-14
        long[] array6 = new long[] {2,-1,8,23,44,-44,2,92,75}; //32733
        long[] array7 = new long[] {2,-1,8,23,44,-44,0,0,0}; //0
        long[] array8 = new long[] {4,5,6,9,9,9,7,8,6}; //27
        long[] array9 = new long[] {0,4,5,9,0,9,7,8,0}; //612
        long[] array10 = new long[] {0,0,0,0,0,0,0,0,0}; //0
        
        // Matrix3x3flat test matrices
        Matrix3x3flat flat1 = new Matrix3x3flat(array1);
        Matrix3x3flat flat2 = new Matrix3x3flat(array2);
        Matrix3x3flat flat3 = new Matrix3x3flat(array3);
        Matrix3x3flat flat4 = new Matrix3x3flat(array4);
        Matrix3x3flat flat5 = new Matrix3x3flat(array5);
        Matrix3x3flat flat6 = new Matrix3x3flat(array6);
        Matrix3x3flat flat7 = new Matrix3x3flat(array7);
        Matrix3x3flat flat8 = new Matrix3x3flat(array8);
        Matrix3x3flat flat9 = new Matrix3x3flat(array9);
        Matrix3x3flat flat10 = new Matrix3x3flat(array10);
        
        // Matrix3x3rc test matrices
        Matrix3x3rc rc1 = new Matrix3x3rc(array1);
        Matrix3x3rc rc2 = new Matrix3x3rc(array2);
        Matrix3x3rc rc3 = new Matrix3x3rc(array3);
        Matrix3x3rc rc4 = new Matrix3x3rc(array4);
        Matrix3x3rc rc5 = new Matrix3x3rc(array5);
        Matrix3x3rc rc6 = new Matrix3x3rc(array6);
        Matrix3x3rc rc7 = new Matrix3x3rc(array7);
        Matrix3x3rc rc8 = new Matrix3x3rc(array8);
        Matrix3x3rc rc9 = new Matrix3x3rc(array9);
        Matrix3x3rc rc10 = new Matrix3x3rc(array10);
        
        // Matrix3x3cr test matrices
        Matrix3x3cr cr1 = new Matrix3x3cr(array1);  
        Matrix3x3cr cr2 = new Matrix3x3cr(array2);  
        Matrix3x3cr cr3 = new Matrix3x3cr(array3);  
        Matrix3x3cr cr4 = new Matrix3x3cr(array4);  
        Matrix3x3cr cr5 = new Matrix3x3cr(array5);  
        Matrix3x3cr cr6 = new Matrix3x3cr(array6);  
        Matrix3x3cr cr7 = new Matrix3x3cr(array7);  
        Matrix3x3cr cr8 = new Matrix3x3cr(array8);  
        Matrix3x3cr cr9 = new Matrix3x3cr(array9);  
        Matrix3x3cr cr10 = new Matrix3x3cr(array10);
        
        // MatrixArrayFlat test matrices
        MatrixArrayFlat Flat1 = new MatrixArrayFlat(array1);  
        MatrixArrayFlat Flat2 = new MatrixArrayFlat(array2);  
        MatrixArrayFlat Flat3 = new MatrixArrayFlat(array3);  
        MatrixArrayFlat Flat4 = new MatrixArrayFlat(array4);  
        MatrixArrayFlat Flat5 = new MatrixArrayFlat(array5);  
        MatrixArrayFlat Flat6 = new MatrixArrayFlat(array6);  
        MatrixArrayFlat Flat7 = new MatrixArrayFlat(array7);  
        MatrixArrayFlat Flat8 = new MatrixArrayFlat(array8);  
        MatrixArrayFlat Flat9 = new MatrixArrayFlat(array9);  
        MatrixArrayFlat Flat10 =  new MatrixArrayFlat(array10);
        
        // MatrixArrayRC test matrices
        MatrixArrayRC RC1 = new MatrixArrayRC(array1);  
        MatrixArrayRC RC2 = new MatrixArrayRC(array2);  
        MatrixArrayRC RC3 = new MatrixArrayRC(array3);  
        MatrixArrayRC RC4 = new MatrixArrayRC(array4);  
        MatrixArrayRC RC5 = new MatrixArrayRC(array5);  
        MatrixArrayRC RC6 = new MatrixArrayRC(array6);  
        MatrixArrayRC RC7 = new MatrixArrayRC(array7);  
        MatrixArrayRC RC8 = new MatrixArrayRC(array8);  
        MatrixArrayRC RC9 = new MatrixArrayRC(array9);  
        MatrixArrayRC RC10 = new MatrixArrayRC(array10);
        
        //MatrixArrayCR test matricies
        MatrixArrayCR CR1 = new MatrixArrayCR(array1);   
        MatrixArrayCR CR2 = new MatrixArrayCR(array2);   
        MatrixArrayCR CR3 = new MatrixArrayCR(array3);   
        MatrixArrayCR CR4 = new MatrixArrayCR(array4);   
        MatrixArrayCR CR5 = new MatrixArrayCR(array5);   
        MatrixArrayCR CR6 = new MatrixArrayCR(array6);   
        MatrixArrayCR CR7 = new MatrixArrayCR(array7);   
        MatrixArrayCR CR8 = new MatrixArrayCR(array8);   
        MatrixArrayCR CR9 = new MatrixArrayCR(array9);   
        MatrixArrayCR CR10 = new MatrixArrayCR(array10); 
        
        
        // Test cases for flat method
        assertEquals(-306, flat1.determinant());
        assertEquals(3, flat2.determinant());
        assertEquals(-51, flat3.determinant());
        assertEquals(-1720, flat4.determinant());
        assertEquals(-14, flat5.determinant());
        assertEquals(32733, flat6.determinant());
        assertEquals(0, flat7.determinant());
        assertEquals(27, flat8.determinant());
        assertEquals(612, flat9.determinant());
        assertEquals(0, flat10.determinant());
        
        // Test cases for rc method
        assertEquals(-306, rc1.determinant()); 
        assertEquals(3, rc2.determinant());    
        assertEquals(-51, rc3.determinant());  
        assertEquals(-1720, rc4.determinant());
        assertEquals(-14, rc5.determinant());  
        assertEquals(32733, rc6.determinant());
        assertEquals(0, rc7.determinant());    
        assertEquals(27, rc8.determinant());   
        assertEquals(612, rc9.determinant());  
        assertEquals(0, rc10.determinant()); 
        
        // Test cases for cr method
        assertEquals(-306, cr1.determinant()); 
        assertEquals(3, cr2.determinant());    
        assertEquals(-51, cr3.determinant());  
        assertEquals(-1720, cr4.determinant());
        assertEquals(-14, cr5.determinant());  
        assertEquals(32733, cr6.determinant());
        assertEquals(0, cr7.determinant());    
        assertEquals(27, cr8.determinant());   
        assertEquals(612, cr9.determinant());  
        assertEquals(0, cr10.determinant());  
        
        // Test cases for Flat method
        assertEquals(-306, Flat1.determinant()); 
        assertEquals(3, Flat2.determinant());    
        assertEquals(-51, Flat3.determinant());  
        assertEquals(-1720, Flat4.determinant());
        assertEquals(-14, Flat5.determinant());  
        assertEquals(32733, Flat6.determinant());
        assertEquals(0, Flat7.determinant());    
        assertEquals(27, Flat8.determinant());   
        assertEquals(612, Flat9.determinant());  
        assertEquals(0, Flat10.determinant());   
        
        // Test cases for RC method
        assertEquals(-306, RC1.determinant());  
        assertEquals(3, RC2.determinant());     
        assertEquals(-51, RC3.determinant());   
        assertEquals(-1720, RC4.determinant()); 
        assertEquals(-14, RC5.determinant());   
        assertEquals(32733, RC6.determinant()); 
        assertEquals(0, RC7.determinant());     
        assertEquals(27, RC8.determinant());    
        assertEquals(612, RC9.determinant());   
        assertEquals(0, RC10.determinant());   
        
        // Test cases for CR method
        assertEquals(-306, CR1.determinant());  
        assertEquals(3, CR2.determinant());     
        assertEquals(-51, CR3.determinant());   
        assertEquals(-1720, CR4.determinant()); 
        assertEquals(-14, CR5.determinant());   
        assertEquals(32733, CR6.determinant()); 
        assertEquals(0, CR7.determinant());     
        assertEquals(27, CR8.determinant());    
        assertEquals(612, CR9.determinant());   
        assertEquals(0, CR10.determinant());    
        
        /* Now the real fun begins. 
         * Time to test methods to other methods.
         */
        
        // Test cases comparing flat to flat
        assertEquals(flat1.determinant(), flat1.determinant());
        assertEquals(flat2.determinant(), flat2.determinant());
        assertEquals(flat3.determinant(), flat3.determinant());
        assertEquals(flat4.determinant(), flat4.determinant());
        assertEquals(flat5.determinant(), flat5.determinant());
        assertEquals(flat6.determinant(), flat6.determinant());
        assertEquals(flat7.determinant(), flat7.determinant());
        assertEquals(flat8.determinant(), flat8.determinant());
        assertEquals(flat9.determinant(), flat9.determinant());
        assertEquals(flat10.determinant(), flat10.determinant());
        
        // Test cases comparing flat to rc
        assertEquals(flat1.determinant(), rc1.determinant());
        assertEquals(flat2.determinant(), rc2.determinant());
        assertEquals(flat3.determinant(), rc3.determinant());
        assertEquals(flat4.determinant(), rc4.determinant());
        assertEquals(flat5.determinant(), rc5.determinant());
        assertEquals(flat6.determinant(), rc6.determinant());
        assertEquals(flat7.determinant(), rc7.determinant());
        assertEquals(flat8.determinant(), rc8.determinant());
        assertEquals(flat9.determinant(), rc9.determinant());
        assertEquals(flat10.determinant(), rc10.determinant());
        
        // Test cases comparing flat to cr
        assertEquals(flat1.determinant(), cr1.determinant());
        assertEquals(flat2.determinant(), cr2.determinant());
        assertEquals(flat3.determinant(), cr3.determinant());
        assertEquals(flat4.determinant(), cr4.determinant());
        assertEquals(flat5.determinant(), cr5.determinant());
        assertEquals(flat6.determinant(), cr6.determinant());
        assertEquals(flat7.determinant(), cr7.determinant());
        assertEquals(flat8.determinant(), cr8.determinant());
        assertEquals(flat9.determinant(), cr9.determinant());
        assertEquals(flat10.determinant(), cr10.determinant());
        
        // Test cases comparing flat to Flat
        assertEquals(flat1.determinant(), Flat1.determinant());
        assertEquals(flat2.determinant(), Flat2.determinant());
        assertEquals(flat3.determinant(), Flat3.determinant());
        assertEquals(flat4.determinant(), Flat4.determinant());
        assertEquals(flat5.determinant(), Flat5.determinant());
        assertEquals(flat6.determinant(), Flat6.determinant());
        assertEquals(flat7.determinant(), Flat7.determinant());
        assertEquals(flat8.determinant(), Flat8.determinant());
        assertEquals(flat9.determinant(), Flat9.determinant());
        assertEquals(flat10.determinant(), Flat10.determinant());
        
        // Test cases comparing flat to RC
        assertEquals(flat1.determinant(), RC1.determinant());
        assertEquals(flat2.determinant(), RC2.determinant());
        assertEquals(flat3.determinant(), RC3.determinant());
        assertEquals(flat4.determinant(), RC4.determinant());
        assertEquals(flat5.determinant(), RC5.determinant());
        assertEquals(flat6.determinant(), RC6.determinant());
        assertEquals(flat7.determinant(), RC7.determinant());
        assertEquals(flat8.determinant(), RC8.determinant());
        assertEquals(flat9.determinant(), RC9.determinant());
        assertEquals(flat10.determinant(), RC10.determinant());
        
        // Test cases comparing flat to CR
        assertEquals(flat1.determinant(), CR1.determinant());
        assertEquals(flat2.determinant(), CR2.determinant());
        assertEquals(flat3.determinant(), CR3.determinant());
        assertEquals(flat4.determinant(), CR4.determinant());
        assertEquals(flat5.determinant(), CR5.determinant());
        assertEquals(flat6.determinant(), CR6.determinant());
        assertEquals(flat7.determinant(), CR7.determinant());
        assertEquals(flat8.determinant(), CR8.determinant());
        assertEquals(flat9.determinant(), CR9.determinant());
        assertEquals(flat10.determinant(), CR10.determinant());
        
        // Test cases comparing rc to flat
        assertEquals(rc1.determinant(), flat1.determinant());  
        assertEquals(rc2.determinant(), flat2.determinant());  
        assertEquals(rc3.determinant(), flat3.determinant());  
        assertEquals(rc4.determinant(), flat4.determinant());  
        assertEquals(rc5.determinant(), flat5.determinant());  
        assertEquals(rc6.determinant(), flat6.determinant());  
        assertEquals(rc7.determinant(), flat7.determinant());  
        assertEquals(rc8.determinant(), flat8.determinant());  
        assertEquals(rc9.determinant(), flat9.determinant());  
        assertEquals(rc10.determinant(), flat10.determinant());
        
        // Test cases comparing rc to rc
        assertEquals(rc1.determinant(), rc1.determinant());   
        assertEquals(rc2.determinant(), rc2.determinant());   
        assertEquals(rc3.determinant(), rc3.determinant());   
        assertEquals(rc4.determinant(), rc4.determinant());   
        assertEquals(rc5.determinant(), rc5.determinant());   
        assertEquals(rc6.determinant(), rc6.determinant());   
        assertEquals(rc7.determinant(), rc7.determinant());   
        assertEquals(rc8.determinant(), rc8.determinant());   
        assertEquals(rc9.determinant(), rc9.determinant());   
        assertEquals(rc10.determinant(), rc10.determinant()); 
        
        // Test cases comparing rc to cr
        assertEquals(rc1.determinant(), cr1.determinant());  
        assertEquals(rc2.determinant(), cr2.determinant());  
        assertEquals(rc3.determinant(), cr3.determinant());  
        assertEquals(rc4.determinant(), cr4.determinant());  
        assertEquals(rc5.determinant(), cr5.determinant());  
        assertEquals(rc6.determinant(), cr6.determinant());  
        assertEquals(rc7.determinant(), cr7.determinant());  
        assertEquals(rc8.determinant(), cr8.determinant());  
        assertEquals(rc9.determinant(), cr9.determinant());  
        assertEquals(rc10.determinant(), cr10.determinant());
        
        // Test cases comparing rc to Flat
        assertEquals(rc1.determinant(), Flat1.determinant());  
        assertEquals(rc2.determinant(), Flat2.determinant());  
        assertEquals(rc3.determinant(), Flat3.determinant());  
        assertEquals(rc4.determinant(), Flat4.determinant());  
        assertEquals(rc5.determinant(), Flat5.determinant());  
        assertEquals(rc6.determinant(), Flat6.determinant());  
        assertEquals(rc7.determinant(), Flat7.determinant());  
        assertEquals(rc8.determinant(), Flat8.determinant());  
        assertEquals(rc9.determinant(), Flat9.determinant());  
        assertEquals(rc10.determinant(), Flat10.determinant());
        
        // Test cases comparing rc to RC
        assertEquals(rc1.determinant(), RC1.determinant());  
        assertEquals(rc2.determinant(), RC2.determinant());  
        assertEquals(rc3.determinant(), RC3.determinant());  
        assertEquals(rc4.determinant(), RC4.determinant());  
        assertEquals(rc5.determinant(), RC5.determinant());  
        assertEquals(rc6.determinant(), RC6.determinant());  
        assertEquals(rc7.determinant(), RC7.determinant());  
        assertEquals(rc8.determinant(), RC8.determinant());  
        assertEquals(rc9.determinant(), RC9.determinant());  
        assertEquals(rc10.determinant(), RC10.determinant());
        
        // Test cases comparing rc to CR
        assertEquals(rc1.determinant(), CR1.determinant());  
        assertEquals(rc2.determinant(), CR2.determinant());  
        assertEquals(rc3.determinant(), CR3.determinant());  
        assertEquals(rc4.determinant(), CR4.determinant());  
        assertEquals(rc5.determinant(), CR5.determinant());  
        assertEquals(rc6.determinant(), CR6.determinant());  
        assertEquals(rc7.determinant(), CR7.determinant());  
        assertEquals(rc8.determinant(), CR8.determinant());  
        assertEquals(rc9.determinant(), CR9.determinant());  
        assertEquals(rc10.determinant(), CR10.determinant());
        
        // Test cases comparing cr to flat
        assertEquals(cr1.determinant(), flat1.determinant());  
        assertEquals(cr2.determinant(), flat2.determinant());  
        assertEquals(cr3.determinant(), flat3.determinant());  
        assertEquals(cr4.determinant(), flat4.determinant());  
        assertEquals(cr5.determinant(), flat5.determinant());  
        assertEquals(cr6.determinant(), flat6.determinant());  
        assertEquals(cr7.determinant(), flat7.determinant());  
        assertEquals(cr8.determinant(), flat8.determinant());  
        assertEquals(cr9.determinant(), flat9.determinant());  
        assertEquals(cr10.determinant(), flat10.determinant());
        
        // Test cases comparing cr to rc
        assertEquals(cr1.determinant(), rc1.determinant());  
        assertEquals(cr2.determinant(), rc2.determinant());  
        assertEquals(cr3.determinant(), rc3.determinant());  
        assertEquals(cr4.determinant(), rc4.determinant());  
        assertEquals(cr5.determinant(), rc5.determinant());  
        assertEquals(cr6.determinant(), rc6.determinant());  
        assertEquals(cr7.determinant(), rc7.determinant());  
        assertEquals(cr8.determinant(), rc8.determinant());  
        assertEquals(cr9.determinant(), rc9.determinant());  
        assertEquals(cr10.determinant(), rc10.determinant());
        
        // Test cases comparing cr to cr
        assertEquals(cr1.determinant(), cr1.determinant());  
        assertEquals(cr2.determinant(), cr2.determinant());  
        assertEquals(cr3.determinant(), cr3.determinant());  
        assertEquals(cr4.determinant(), cr4.determinant());  
        assertEquals(cr5.determinant(), cr5.determinant());  
        assertEquals(cr6.determinant(), cr6.determinant());  
        assertEquals(cr7.determinant(), cr7.determinant());  
        assertEquals(cr8.determinant(), cr8.determinant());  
        assertEquals(cr9.determinant(), cr9.determinant());  
        assertEquals(cr10.determinant(), cr10.determinant());
        
        // Test cases comparing cr to Flat
        assertEquals(cr1.determinant(), Flat1.determinant());  
        assertEquals(cr2.determinant(), Flat2.determinant());  
        assertEquals(cr3.determinant(), Flat3.determinant());  
        assertEquals(cr4.determinant(), Flat4.determinant());  
        assertEquals(cr5.determinant(), Flat5.determinant());  
        assertEquals(cr6.determinant(), Flat6.determinant());  
        assertEquals(cr7.determinant(), Flat7.determinant());  
        assertEquals(cr8.determinant(), Flat8.determinant());  
        assertEquals(cr9.determinant(), Flat9.determinant());  
        assertEquals(cr10.determinant(), Flat10.determinant());
        
        // Test cases comparing cr to RC
        assertEquals(cr1.determinant(), RC1.determinant());  
        assertEquals(cr2.determinant(), RC2.determinant());  
        assertEquals(cr3.determinant(), RC3.determinant());  
        assertEquals(cr4.determinant(), RC4.determinant());  
        assertEquals(cr5.determinant(), RC5.determinant());  
        assertEquals(cr6.determinant(), RC6.determinant());  
        assertEquals(cr7.determinant(), RC7.determinant());  
        assertEquals(cr8.determinant(), RC8.determinant());  
        assertEquals(cr9.determinant(), RC9.determinant());  
        assertEquals(cr10.determinant(), RC10.determinant());
        
        // Test cases comparing cr to CR
        assertEquals(cr1.determinant(), CR1.determinant());  
        assertEquals(cr2.determinant(), CR2.determinant());  
        assertEquals(cr3.determinant(), CR3.determinant());  
        assertEquals(cr4.determinant(), CR4.determinant());  
        assertEquals(cr5.determinant(), CR5.determinant());  
        assertEquals(cr6.determinant(), CR6.determinant());  
        assertEquals(cr7.determinant(), CR7.determinant());  
        assertEquals(cr8.determinant(), CR8.determinant());  
        assertEquals(cr9.determinant(), CR9.determinant());  
        assertEquals(cr10.determinant(), CR10.determinant());
        
        // Test cases comparing Flat to flat
        assertEquals(Flat1.determinant(), flat1.determinant());  
        assertEquals(Flat2.determinant(), flat2.determinant());  
        assertEquals(Flat3.determinant(), flat3.determinant());  
        assertEquals(Flat4.determinant(), flat4.determinant());  
        assertEquals(Flat5.determinant(), flat5.determinant());  
        assertEquals(Flat6.determinant(), flat6.determinant());  
        assertEquals(Flat7.determinant(), flat7.determinant());  
        assertEquals(Flat8.determinant(), flat8.determinant());  
        assertEquals(Flat9.determinant(), flat9.determinant());  
        assertEquals(Flat10.determinant(), flat10.determinant());
        
        // Test cases comparing Flat to rc
        assertEquals(Flat1.determinant(), rc1.determinant());  
        assertEquals(Flat2.determinant(), rc2.determinant());  
        assertEquals(Flat3.determinant(), rc3.determinant());  
        assertEquals(Flat4.determinant(), rc4.determinant());  
        assertEquals(Flat5.determinant(), rc5.determinant());  
        assertEquals(Flat6.determinant(), rc6.determinant());  
        assertEquals(Flat7.determinant(), rc7.determinant());  
        assertEquals(Flat8.determinant(), rc8.determinant());  
        assertEquals(Flat9.determinant(), rc9.determinant());  
        assertEquals(Flat10.determinant(), rc10.determinant());
        
        // Test cases comparing Flat to cr
        assertEquals(Flat1.determinant(), cr1.determinant());  
        assertEquals(Flat2.determinant(), cr2.determinant());  
        assertEquals(Flat3.determinant(), cr3.determinant());  
        assertEquals(Flat4.determinant(), cr4.determinant());  
        assertEquals(Flat5.determinant(), cr5.determinant());  
        assertEquals(Flat6.determinant(), cr6.determinant());  
        assertEquals(Flat7.determinant(), cr7.determinant());  
        assertEquals(Flat8.determinant(), cr8.determinant());  
        assertEquals(Flat9.determinant(), cr9.determinant());  
        assertEquals(Flat10.determinant(), cr10.determinant());
        
        // Test cases comparing Flat to Flat
        assertEquals(Flat1.determinant(), Flat1.determinant());
        assertEquals(Flat2.determinant(), Flat2.determinant());
        assertEquals(Flat3.determinant(), Flat3.determinant());
        assertEquals(Flat4.determinant(), Flat4.determinant());
        assertEquals(Flat5.determinant(), Flat5.determinant());
        assertEquals(Flat6.determinant(), Flat6.determinant());
        assertEquals(Flat7.determinant(), Flat7.determinant());
        assertEquals(Flat8.determinant(), Flat8.determinant());
        assertEquals(Flat9.determinant(), Flat9.determinant());
        assertEquals(Flat10.determinant(), Flat10.determinant());
        
        // Test cases comparing Flat to RC
        assertEquals(Flat1.determinant(), RC1.determinant());   
        assertEquals(Flat2.determinant(), RC2.determinant());  
        assertEquals(Flat3.determinant(), RC3.determinant());  
        assertEquals(Flat4.determinant(), RC4.determinant());  
        assertEquals(Flat5.determinant(), RC5.determinant());  
        assertEquals(Flat6.determinant(), RC6.determinant());  
        assertEquals(Flat7.determinant(), RC7.determinant());  
        assertEquals(Flat8.determinant(), RC8.determinant());  
        assertEquals(Flat9.determinant(), RC9.determinant());  
        assertEquals(Flat10.determinant(), RC10.determinant());
                                                               
        // Test cases comparing Flat to CR                                                       
        assertEquals(Flat1.determinant(), CR1.determinant());  
        assertEquals(Flat2.determinant(), CR2.determinant());  
        assertEquals(Flat3.determinant(), CR3.determinant());  
        assertEquals(Flat4.determinant(), CR4.determinant());  
        assertEquals(Flat5.determinant(), CR5.determinant());  
        assertEquals(Flat6.determinant(), CR6.determinant());  
        assertEquals(Flat7.determinant(), CR7.determinant());          assertEquals(Flat8.determinant(), CR8.determinant());          assertEquals(Flat9.determinant(), CR9.determinant());          assertEquals(Flat10.determinant(), CR10.determinant());
        
        // Test cases comparing RC to flat
        assertEquals(RC1.determinant(), flat1.determinant());   
        assertEquals(RC2.determinant(), flat2.determinant());                                  
        assertEquals(RC3.determinant(), flat3.determinant());                                  
        assertEquals(RC4.determinant(), flat4.determinant());                                  
        assertEquals(RC5.determinant(), flat5.determinant());                                  
        assertEquals(RC6.determinant(), flat6.determinant());                                  
        assertEquals(RC7.determinant(), flat7.determinant());                                  
        assertEquals(RC8.determinant(), flat8.determinant());                                  
        assertEquals(RC9.determinant(), flat9.determinant());                                  
        assertEquals(RC10.determinant(), flat10.determinant()); 
        
        // Test cases comparing RC to rc
        assertEquals(RC1.determinant(), rc1.determinant());  
        assertEquals(RC2.determinant(), rc2.determinant());  
        assertEquals(RC3.determinant(), rc3.determinant());  
        assertEquals(RC4.determinant(), rc4.determinant());  
        assertEquals(RC5.determinant(), rc5.determinant());  
        assertEquals(RC6.determinant(), rc6.determinant());  
        assertEquals(RC7.determinant(), rc7.determinant());  
        assertEquals(RC8.determinant(), rc8.determinant());  
        assertEquals(RC9.determinant(), rc9.determinant());  
        assertEquals(RC10.determinant(), rc10.determinant());
        
        // Test cases for comparing RC to cr
        assertEquals(RC1.determinant(), cr1.determinant());   
        assertEquals(RC2.determinant(), cr2.determinant());   
        assertEquals(RC3.determinant(), cr3.determinant());   
        assertEquals(RC4.determinant(), cr4.determinant());   
        assertEquals(RC5.determinant(), cr5.determinant());   
        assertEquals(RC6.determinant(), cr6.determinant());   
        assertEquals(RC7.determinant(), cr7.determinant());   
        assertEquals(RC8.determinant(), cr8.determinant());   
        assertEquals(RC9.determinant(), cr9.determinant());   
        assertEquals(RC10.determinant(), cr10.determinant()); 
        
        // Test cases for comparing RC to Flat
        assertEquals(RC1.determinant(), Flat1.determinant());  
        assertEquals(RC2.determinant(), Flat2.determinant());  
        assertEquals(RC3.determinant(), Flat3.determinant());  
        assertEquals(RC4.determinant(), Flat4.determinant());  
        assertEquals(RC5.determinant(), Flat5.determinant());  
        assertEquals(RC6.determinant(), Flat6.determinant());  
        assertEquals(RC7.determinant(), Flat7.determinant());  
        assertEquals(RC8.determinant(), Flat8.determinant());  
        assertEquals(RC9.determinant(), Flat9.determinant());  
        assertEquals(RC10.determinant(), Flat10.determinant());
        
        // Test cases comparing RC to RC
        assertEquals(RC1.determinant(), RC1.determinant());  
        assertEquals(RC2.determinant(), RC2.determinant());  
        assertEquals(RC3.determinant(), RC3.determinant());  
        assertEquals(RC4.determinant(), RC4.determinant());  
        assertEquals(RC5.determinant(), RC5.determinant());  
        assertEquals(RC6.determinant(), RC6.determinant());  
        assertEquals(RC7.determinant(), RC7.determinant());  
        assertEquals(RC8.determinant(), RC8.determinant());  
        assertEquals(RC9.determinant(), RC9.determinant());  
        assertEquals(RC10.determinant(), RC10.determinant());
        
        // Test cases comparing RC to CR
        assertEquals(RC1.determinant(), CR1.determinant());  
        assertEquals(RC2.determinant(), CR2.determinant());  
        assertEquals(RC3.determinant(), CR3.determinant());  
        assertEquals(RC4.determinant(), CR4.determinant());  
        assertEquals(RC5.determinant(), CR5.determinant());  
        assertEquals(RC6.determinant(), CR6.determinant());  
        assertEquals(RC7.determinant(), CR7.determinant());  
        assertEquals(RC8.determinant(), CR8.determinant());  
        assertEquals(RC9.determinant(), CR9.determinant());  
        assertEquals(RC10.determinant(), CR10.determinant());
        
        // Test cases comparing CR to flat
        assertEquals(CR1.determinant(), flat1.determinant());  
        assertEquals(CR2.determinant(), flat2.determinant());  
        assertEquals(CR3.determinant(), flat3.determinant());  
        assertEquals(CR4.determinant(), flat4.determinant());  
        assertEquals(CR5.determinant(), flat5.determinant());  
        assertEquals(CR6.determinant(), flat6.determinant());  
        assertEquals(CR7.determinant(), flat7.determinant());  
        assertEquals(CR8.determinant(), flat8.determinant());  
        assertEquals(CR9.determinant(), flat9.determinant());  
        assertEquals(CR10.determinant(), flat10.determinant());
        
        // Test cases comparing CR to rc
        assertEquals(CR1.determinant(), rc1.determinant());  
        assertEquals(CR2.determinant(), rc2.determinant());  
        assertEquals(CR3.determinant(), rc3.determinant());  
        assertEquals(CR4.determinant(), rc4.determinant());  
        assertEquals(CR5.determinant(), rc5.determinant());  
        assertEquals(CR6.determinant(), rc6.determinant());  
        assertEquals(CR7.determinant(), rc7.determinant());  
        assertEquals(CR8.determinant(), rc8.determinant());  
        assertEquals(CR9.determinant(), rc9.determinant());  
        assertEquals(CR10.determinant(), rc10.determinant());
        
        // Test cases comparing CR to cr
        assertEquals(CR1.determinant(), cr1.determinant());  
        assertEquals(CR2.determinant(), cr2.determinant());  
        assertEquals(CR3.determinant(), cr3.determinant());  
        assertEquals(CR4.determinant(), cr4.determinant());  
        assertEquals(CR5.determinant(), cr5.determinant());  
        assertEquals(CR6.determinant(), cr6.determinant());  
        assertEquals(CR7.determinant(), cr7.determinant());  
        assertEquals(CR8.determinant(), cr8.determinant());  
        assertEquals(CR9.determinant(), cr9.determinant());  
        assertEquals(CR10.determinant(), cr10.determinant());
        
        // Test cases comparing CR to Flat
        assertEquals(CR1.determinant(), Flat1.determinant());  
        assertEquals(CR2.determinant(), Flat2.determinant());  
        assertEquals(CR3.determinant(), Flat3.determinant());  
        assertEquals(CR4.determinant(), Flat4.determinant());  
        assertEquals(CR5.determinant(), Flat5.determinant());  
        assertEquals(CR6.determinant(), Flat6.determinant());  
        assertEquals(CR7.determinant(), Flat7.determinant());  
        assertEquals(CR8.determinant(), Flat8.determinant());  
        assertEquals(CR9.determinant(), Flat9.determinant());  
        assertEquals(CR10.determinant(), Flat10.determinant());
        
        // Test cases comparing CR to RC
        assertEquals(CR1.determinant(), RC1.determinant());  
        assertEquals(CR2.determinant(), RC2.determinant());  
        assertEquals(CR3.determinant(), RC3.determinant());  
        assertEquals(CR4.determinant(), RC4.determinant());  
        assertEquals(CR5.determinant(), RC5.determinant());  
        assertEquals(CR6.determinant(), RC6.determinant());  
        assertEquals(CR7.determinant(), RC7.determinant());  
        assertEquals(CR8.determinant(), RC8.determinant());  
        assertEquals(CR9.determinant(), RC9.determinant());  
        assertEquals(CR10.determinant(), RC10.determinant());
        
        // Test cases comparing CR to CR
        assertEquals(CR1.determinant(), CR1.determinant());  
        assertEquals(CR2.determinant(), CR2.determinant());  
        assertEquals(CR3.determinant(), CR3.determinant());  
        assertEquals(CR4.determinant(), CR4.determinant());  
        assertEquals(CR5.determinant(), CR5.determinant());  
        assertEquals(CR6.determinant(), CR6.determinant());  
        assertEquals(CR7.determinant(), CR7.determinant());  
        assertEquals(CR8.determinant(), CR8.determinant());  
        assertEquals(CR9.determinant(), CR9.determinant());  
        assertEquals(CR10.determinant(), CR10.determinant());
        
    }
}