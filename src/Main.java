import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        int result = 0;
        String outputStr = "";
        int op1, op2 = 0;
        System.out.println("Input");
        Scanner scanner = new Scanner(System.in);

        boolean isExit = false;
        while (!isExit) {
            String[] data = scanner.nextLine().replaceAll("\\s+", "").split("");
            String input1 = data[0];
            String operator = data[1];
            String input2 = data[2];
            //String input1 = scanner.nextLine();
            //String operator = scanner.nextLine();
            //String input2 = scanner.nextLine();

            System.out.println("Output");
            input1 = input1.toUpperCase();
            input2 = input2.toUpperCase();
            Validate validate = new Validate();
            // validate.validateInput(input1, input2, operator)[0]
            if (validate.validateInput(input1, operator, input2) == ("roman")) {
                ConvertRoman romanOp = new ConvertRoman();
                op1 = romanOp.romanToInt(input1);
                op2 = romanOp.romanToInt(input2);
                switch (operator) {
                    case "+":
                        result = op1 + op2;
                        break;
                    case "-":
                        result = op1 - op2;
                        break;
                    case "/":
                        result = op1 / op2;
                        break;
                    case "*":
                        result = op1 * op2;
                        break;
                }
                outputStr = romanOp.intToRoman(result);
            } else {
                op1 = Integer.parseInt(input1);
                op2 = Integer.parseInt(input2);
                switch (operator) {
                    case "+":
                        result = op1 + op2;
                        break;
                    case "-":
                        result = op1 - op2;
                        break;
                    case "/":
                        result = op1 / op2;
                        break;
                    case "*":
                        result = op1 * op2;
                        break;
                }
                outputStr = Integer.toString(result);
            }

            System.out.println(outputStr);

            return;
        }
    }
}