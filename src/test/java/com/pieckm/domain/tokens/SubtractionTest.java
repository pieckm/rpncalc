package com.pieckm.domain.tokens;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class SubtractionTest
{
    private Subtraction subtraction = new Subtraction();

    @Test
    public void testMatchesTrue()
    {
        Assert.assertTrue(subtraction.matches(Subtraction.REPRESENTATION));
    }

    @Test
    public void testMatchesFalse()
    {
        Assert.assertFalse(subtraction.matches(null));
        Assert.assertFalse(subtraction.matches(""));
        Assert.assertFalse(subtraction.matches("+-"));
    }

    @Test
    public void testEvaluateWithEmptyStack()
    {
        Stack<Float> stack = new Stack<Float>();

        subtraction.evaluate(stack);

        Assert.assertEquals((Float)0.0f, (Float)stack.pop());
    }

    @Test
    public void testEvaluateWithOneValueOnStack()
    {
        Stack<Float> stack = new Stack<Float>();

        float value = 1.0F;

        stack.push(value);

        subtraction.evaluate(stack);

        Assert.assertEquals((Float)value, (Float)stack.pop());
    }

    @Test
    public void testEvaluateWithTwoValuesOnStack()
    {
        Stack<Float> stack = new Stack<Float>();

        float value1 = 1.0F;
        float value2 = 2.0F;

        stack.push(value1);
        stack.push(value2);

        subtraction.evaluate(stack);

        Assert.assertEquals((Float)(value1 - value2), (Float)stack.pop());
    }
}
