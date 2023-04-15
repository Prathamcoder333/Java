import java.util.Scanner;

/**
 * Calculator
 */
public class Main {

    public static void main(String[] args) 
    {
       char operator;
       double num1 , num2 , result; 

    //    Create Object For Scanner Class
       Scanner myObj = new Scanner(System.in);

    //  Take input from user for operator
       System.out.println("Enter a Operator i.e +,-,*,/");
       operator = myObj.next().charAt(0);

    //  Take use rinput for num1 and num2
       System.out.print("Enter first Number:  ");
       num1 = myObj.nextDouble();

       System.out.println("Enter second number:  ");
       num2 = myObj.nextDouble();

    //  USe of switch statements for sum, diff , multiply and divide
        switch(operator){
            // addition
            case '+':
            result = num1+num2;
            System.out.println(num1 + "+" + num2 + "=" + result);
            break;

            // Subtract
            case '-':
            result = num1-num2;
            System.out.println(num1 + "-" + num2 + "=" + result);
            break;

            // Multiply
            case '*':
            result = num1*num2;
            System.out.println(num1 + "*" + num2 + "=" + result);
            break;

            // Divide
            case '/':
            result = num1/num2;
            System.out.println(num1 + "/" + num2 + "=" + result);
            break;

            
        }

        myObj.close();
    }
}
