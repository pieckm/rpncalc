package com.pieckm.domain.tokens;

 abstract public class Operator
    implements Token
{
    abstract public String getRepresentation();

    public boolean
    matches(String value)
    {
        return this.getRepresentation().equals(value);
    }
}
