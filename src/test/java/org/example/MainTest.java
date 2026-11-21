package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class MainTest {
    @Test
    public void testmain(){
        Main obj = new Main();
        assertEquals(7,obj.add(5,2));
        assertEquals(3,obj.sub(5,2));
        assertEquals(15,obj.mul(5,3));
        assertEquals(3,obj.div(15,5));
    }
}
