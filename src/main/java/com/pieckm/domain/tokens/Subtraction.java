package com.pieckm.domain.tokens;

import java.util.Stack;

public class Subtraction
    extends Operator
{
    public static String REPRESENTATION = "-";

    @Override
    public String getRepresentation()
    {
        return Subtraction.REPRESENTATION;
    }

    @Override
    public void evaluate(Stack<Float> stack)
    {
        if (stack.size() == 0)
        {
            stack.push(0.0f);
        }
        else if (stack.size() > 1)
        {
            Float subtrahend = stack.pop();
            Float minuend = stack.pop();

            stack.push(minuend - subtrahend);
        }
    }
}
