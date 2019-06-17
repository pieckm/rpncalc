package com.pieckm.domain.tokens;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class OperandTest
{
    @Test
    public void testMatchesTrue()
    {
        Assert.assertTrue(Operand.matches("0"));
        Assert.assertTrue(Operand.matches("0.0"));
        Assert.assertTrue(Operand.matches(".1"));

    }

    @Test
    public void testMatchesFalse()
    {
        Assert.assertFalse(Operand.matches(""));
        Assert.assertFalse(Operand.matches(null));
        Assert.assertFalse(Operand.matches("1."));
    }

    @Test
    public void testEvaluate()
    {
        Float testValue = 1.1f;

        Operand operand = new Operand(testValue);

        Stack<Float> stack = new Stack<Float>();

        operand.evaluate(stack);

        Assert.assertEquals(testValue, stack.pop());
    }
}