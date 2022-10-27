import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Calculator");
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expression = scan.nextLine();

        double num1;
        double num2;
        double result;

        if (expression.indexOf("*") != -1){
            num1 = parseInt(operat)
        } else if (expression.indexOf("/") != -1){

        } else if (expression.indexOf("+") != -1){

        } else if (expression.indexOf("-") != -1){

        } else if (expression.indexOf("%") != -1){

        } else {

        }
    }
}
