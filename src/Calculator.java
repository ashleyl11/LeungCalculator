import static java.lang.Integer.parseInt;

public class Calculator {
    private double num1; // the two numbers that the code will operate on
    private double num2;

    // intializing the two numbers
    public Calculator(double num1, double num2){
       this.num1 = num1;
       this.num2 = num2;
    }

    public Calculator(){
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

    // num extractor
    public double extractOne(String expression, String operation){
        return parseInt(expression.substring(0,expression.indexOf(operation)));
    }
    public double extractTwo(String expression, String operation){
        return parseInt(expression.substring(expression.indexOf(operation)+1));
    }
}
