package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction obj;
    
    @Before
    public void Before() {
        obj = new Fraction(10,5);
    }
    @Test
    public void testGetNumerator() {
        assertEquals(10,obj.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(5,obj.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2,obj.decimal(),2);
    }
    
    @Test
    public void testMultiply() {
        Fraction b = new Fraction(1,2);
        assertEquals(1, obj.multiply(b), 10e-5);
    }

}
