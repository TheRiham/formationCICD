package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathsTest2 {

    private IMaths maths;

    @Before
    public void setUp(){
        // init context
        maths = new Maths();
    }
    @Test
    public void testDivisionCasNominal() throws MathsExceptions {
        Assert.assertEquals(2,this.maths.division(4,2),0);
    }

    @Test
    public void testDivisionParZeroInterdit(){
        try {
            this.maths.division(4,0);
        } catch (MathsExceptions e) {
            Assert.assertEquals("Division par zero impossible",e.getMessage());
        }

    }

    @Test
    public void testMultiplicationTousPositifs(){
        Assert.assertEquals(4, this.maths.multiplication(2,2));
    }

    @Test
    public void testMultiplicationTousNegatifs(){
        Assert.assertEquals(4, this.maths.multiplication(-2,-2));
    }

    @Test
    public void testMultiplicationPositifNegatif(){
        Assert.assertEquals(-4, this.maths.multiplication(2,-2));
    }
}
