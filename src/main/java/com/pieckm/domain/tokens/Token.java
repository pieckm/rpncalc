package com.pieckm.domain.tokens;

import java.util.Stack;

public interface Token
{
    public void evaluate(Stack<Float> stack);
}
