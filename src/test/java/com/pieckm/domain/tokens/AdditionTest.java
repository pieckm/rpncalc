package com.pieckm.domain.tokens;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class AdditionTest
{
    private Addition addition = new Addition();

    @Test
    public void testMatchesTrue()
    {
        Assert.assertTrue(addition.matches(Addition.REPRESENTATION));
    }

    @Test
    public void testMatchesFalse()
    {
        Assert.assertFalse(addition.matches(null));
        Assert.assertFalse(addition.matches(""));
        Assert.assertFalse(addition.matches("+-"));
    }

    @Test
    public void testEvaluateWithEmptyStack()
    {
        Stack<Float> stack = new Stack<Float>();

        addition.evaluate(stack);

        Assert.assertEquals((Float)0.0f, (Float)stack.pop());
    }

    @Test
    public void testEvaluateWithOneValueOnStack()
    {
        Stack<Float> stack = new Stack<Float>();

        float value = 1.0F;

        stack.push(value);

        addition.evaluate(stack);

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

        addition.evaluate(stack);

        Assert.assertEquals((Float)(value1 + value2), (Float)stack.pop());
    }
}