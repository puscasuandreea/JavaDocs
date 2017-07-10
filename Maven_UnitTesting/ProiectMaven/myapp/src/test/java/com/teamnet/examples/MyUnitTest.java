package com.teamnet.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Andreea.Puscasu on 7/10/2017.
 */
public class MyUnitTest {
    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "two");

        assertEquals("onetwo", result);

    }
    @Test
    public void testConcatenateNulls(){
        MyUnit myUnit = new MyUnit();
        String result = myUnit.concatenate(null,null);
        assertEquals(null,result);

        result = myUnit.concatenate("one",null);
        assertEquals("one",result);

        result = myUnit.concatenate("two",null);
        assertEquals("two",result);
    }

    @Test
    public void testGetBoolean(){
        MyUnit myUnit = new MyUnit();

        assertFalse(myUnit.getBoolean());
        assertThat(1 + 2, is(5));
    }
}