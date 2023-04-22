package Task5;

import java.util.Scanner;

public class Main {
static double num1, num2;
static String result;
    public static void main(String[] args) {
        try {
            inputData();
            calculation();
            System.out.println("Result is : " + result);
            if (result == null)
                System.out.println("You enter wrong data. Please repeat this operation with correct data");
        } catch (Exception e){
            System.out.println("You enter wrong data. Please try again");
        }
    }


    static void inputData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number for calculation");
        num1 = in.nextDouble();
        in.nextLine();
        System.out.println("Enter second number for calculation");
        num2 = in.nextDouble();
        in.nextLine();
    }

    static void calculation(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one of operation : '+' '-' '*' '/'");
        String operation = in.next();
        try {
            switch (operation) {
                case "+": {
                    result = "" + Calculator.add(num1, num2);
                    break;
                }
                case "-": {
                    result = "" + Calculator.sub(num1, num2);
                    break;
                }
                case "*": {
                    result = "" + Calculator.mul(num1, num2);
                    break;
                }
                case "/": {
                    if (num2 == 0) {
                        Exception exception = new ArithmeticException("You can not divine on 0");

                        throw exception;
                    }else result = "" + Calculator.div(num1, num2);
                    break;
                }
            }
        }catch ( Exception ex ){
            result = ex.getMessage();
        }
    }


}


