public class Calculator {
    private String operation;

    public Calculator(String expression){
        if (expression.indexOf("/") != -1){
            operation = "/";
        } else if (expression.indexOf("*") != -1){
            operation = "*";
        } else if (expression.indexOf("^") != -1){
            expression = "^";
        } else if (expression.indexOf("+") != -1){
            expression = "+";
        } else if
    }
}
