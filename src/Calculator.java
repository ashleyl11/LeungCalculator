import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Calculator {
    private double num1; // the two numbers that the code will operate on
    private double num2;

    // intializing the two numbers

    public Calculator(String expression,String operation){
        num1 = parseDouble(expression.substring(0,expression.indexOf(operation)));
        num2 = parseDouble(expression.substring(expression.indexOf(operation)+1));
    }

    // multiplication method
    public double multiply(){
        return num1*num2;
    }

    // division method
    public double divide(){
        return (double)num1/num2;
    }

    // addition method
    public double addition(){
        return num1+num2;
    }

    // subtraction method
    public double subtraction(){
        return num1-num2;
    }

    // mod
    public double mod(){
        return num1%num2;
    }

    // exponent
    public double exponent(){
        return Math.pow(num1,num2);
    }

}
