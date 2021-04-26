package lab10_4;

public interface IExpression {
    static double evaluate(String expression) throws ExpressionException
    {
        String[] str=expression.split(" ");
        Stack myStack=new Stack(100);
        for (String s : str)//Iterate through all inputs
        {
            if (!(isOperator(s)))//If not operator
            {
                try {
                    double i=Double.parseDouble(s);
                    myStack.push(i);
                } catch (StackException e)
                {
                    throw new ExpressionException("Wrong postfix expression");
                }
                catch (NumberFormatException e)
                {
                    throw new ExpressionException("Wrong operand:" + s);
                }
            }
            else//If operator
            {
                try {
                    double res=(double)myStack.top();
                    myStack.pop();
                    double val=(double)myStack.top();
                    myStack.pop();

                    switch (s)
                    {
                        case "+":
                            res+=val;
                            break;
                        case "-":
                            res-=val;
                            break;
                        case "*":
                            res*=val;
                            break;
                        case "/":
                            res/=val;
                            break;
                        default:
                            break;
                    }
                    myStack.push(res);

                } catch (StackException e)
                {
                    throw new ExpressionException("Wrong postfix expression!");
                }
            }
        }
        try{
            return (double)myStack.top();
        }
        catch (StackException e)
        {
            throw new ExpressionException("Wrong postfix expression!");
        }
    }

    static boolean isOperator(String s)
    {
        return (s.equals("/") || s.equals("*") || s.equals("+") || s.equals("-"));
    }
}
