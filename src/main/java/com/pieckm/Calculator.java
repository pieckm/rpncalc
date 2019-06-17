package com.pieckm;


import com.pieckm.domain.tokens.Token;
import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.set.MutableSet;
import org.eclipse.collections.impl.set.mutable.UnifiedSet;

import java.util.Stack;

public class Calculator
{
    public Float
    evaluate(ImmutableList<Token> tokens)
    {
        Float result = 0.0f;

        Stack<Float> stack = new Stack<>();

        if (tokens != null && tokens.size() > 0)
        {
            tokens.each(token -> token.evaluate(stack));

            result = stack.pop();
        }

        return result;
    }
}

