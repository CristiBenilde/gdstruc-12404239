import java.util.ArrayList;
import java.util.EmptyStackException;

public class CardStack
{
    private Cards[] stack;
    private int top;

    public CardStack(int capacity)
    {
        stack = new Cards[capacity];
        top = -1;
    }

    public void push(Cards Cards)
    {
        if (top == stack.length - 1)
        {
            Cards[] newStack = new Cards[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }

        stack[++top] = Cards;
    }

    public Cards pop()
    {
        if (isEmpty())
        {
             return  null;
        }

        Cards Popped = stack[top];
        stack[top] = null;
        top--;

        return Popped;
    }

    public Cards peek()
    {
        if (isEmpty())
        {
            throw new EmptyStackException();
        }

        return stack[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public int size()
    {
        return top + 1;
    }
}
