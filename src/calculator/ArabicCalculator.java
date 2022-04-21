package calculator;

public class ArabicCalculator {

    public static void calculate(String console) {
        // или parseInt или valueoff
        int operand1 = Integer.parseInt(console.split(" ")[0]);
        int operand2 = Integer.parseInt(console.split(" ")[2]);
        String operator = console.split(" ")[1];

        if (operator.equals("+")) {
            sum(operand1, operand2);
        } else if (operator.equals("-")) {
            sub(operand1, operand2);
        } else if (operator.equals("*")) {
            mult(operand1, operand2);
        } else if (operator.equals("/")) {
            div(operand1, operand2);
        }
        //  или строки с 11-19 работают чепез if ИЛИ строки  с 22-37 case

//        switch (operator) {   //
//            case "+":
//                sum(operand1, operand2);
//                break;
//            case "-":
//                sub(operand1, operand2);
//                break;
//            case "*":
//                mult(operand1, operand2);
//                break;
//            case "/":
//                div(operand1, operand2);
//                break;
//            default:
//                System.out.println("Invalid operator");
//        }

    }
    // надо проверить условия-
    // нет 1 числа
    // нет 2 числа
    // деление на 0
    // некорректный оператор
    // дробные числа
    // плавающая точка?


    private static void sum(int operand1, int operand2) {  // сложение
        System.out.println(operand1 + operand2);
    }

    private static void sub(int operand1, int operand2) {  //вычитание
        System.out.println(operand1 - operand2);
    }

    private static void mult(int operand1, int operand2) {  // умножение
        System.out.println(operand1 * operand2);
    }

    private static void div(int operand1, int operand2) {   // деление
        if (operand2 != 0) {
            System.out.println(operand1 / operand2);
        } else {
            System.out.println("Error: division by 0");
        }
    }

}



