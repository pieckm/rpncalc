package com.pieckm.domain.tokens;

import java.util.Stack;

public class Operand
    implements Token
{
    private float value;

    public Operand(float value)
    {
        this.value = value;
    }

    public static boolean matches(String value)
    {
        return value != null && value.matches("^[-+]?[0-9]*\\.?[0-9]+$");
    }

    public float getValue()
    {
        return value;
    }

    @Override
    public void evaluate(Stack<Float> stack)
    {
        stack.push(this.value);
    }
}
