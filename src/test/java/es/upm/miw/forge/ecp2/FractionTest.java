package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction Obj;
    
    @Before
    public void Before() {
        Obj = new Fraction(10,5);
    }
    @Test
    public void testGetNumerator() {
        assertEquals(10,Obj.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(5,Obj.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2,Obj.decimal(),2);
    }

}
