package com.pieckm.domain.tokens;

import java.util.Stack;

public class Addition
    extends Operator
{
    static public String REPRESENTATION = "+";

    @Override
    public String getRepresentation()
    {
        return Addition.REPRESENTATION;
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
            stack.push(stack.pop() + stack.pop());
        }
    }
}
