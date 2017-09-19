package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User Obj;
    
    @Before
    public void Before() {
        Obj = new User(28,"Luis Marcos","Rodriguez");
    }

    @Test
    public void testGetNumber() {
        assertEquals(28,Obj.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Luis marcos",Obj.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Rodriguez",Obj.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Luis marcos Rodriguez",Obj.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("L.",Obj.initials());
    }

}
