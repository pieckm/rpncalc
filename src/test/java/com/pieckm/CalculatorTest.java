package com.pieckm;

import static org.junit.Assert.assertTrue;

import com.pieckm.domain.tokens.Addition;
import com.pieckm.domain.tokens.Operand;
import com.pieckm.domain.tokens.Subtraction;
import com.pieckm.domain.tokens.Token;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.impl.list.mutable.FastList;
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest
{
    private Calculator calculator = new Calculator();
    @Test
    public void testEvaluateWithNoTokens()
    {
        Assert.assertEquals((Float)0.0f, (Float)calculator.evaluate(null));

        ImmutableList<Token> emptyList = new FastList<Token>().toImmutable();
        Assert.assertEquals((Float)0.0f, (Float)calculator.evaluate(emptyList));
    }

    @Test
    public void testEvaluateWithOneOperand()
    {
        float value = 123.0f;
        Token operand = new Operand(value);

        Assert.assertEquals((Float)value,
                (Float)this.calculator.evaluate(FastList.newListWith(operand).toImmutable()));


    }

    @Test
    public void testEvaluateWithOneOperator()
    {
        Token addition = new Addition();

        Assert.assertEquals((Float)0.0f,
                (Float)this.calculator.evaluate(FastList.newListWith(addition).toImmutable()));
    }

    @Test
    public void testAddition()
    {
        Float val1 = 1.0f;
        Float val2 = 2.0f;

        Token addition = new Addition();
        Token value1 = new Operand(val1);
        Token value2 = new Operand(val2);


        Assert.assertEquals((Float)(val1 + val2),
                (Float)this.calculator.evaluate(FastList.newListWith(value1, value2, addition).toImmutable()));
    }

    @Test
    public void testSubtraction()
    {
        Float val1 = 10.0f;
        Float val2 = 2.0f;

        Token subtraction = new Subtraction();
        Token value1 = new Operand(val1);
        Token value2 = new Operand(val2);


        Assert.assertEquals((Float)(val1 - val2),
                (Float)this.calculator.evaluate(FastList.newListWith(value1, value2, subtraction).toImmutable()));
    }
}
