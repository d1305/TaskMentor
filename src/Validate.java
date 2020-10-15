public class Validate {
    private boolean isRoman(String inputStr){
        return inputStr.matches("^I$|^II$|^III$|^IV$|^V$|^VI$|^VII$|^VIII$|^IX$|^X$");
    }

    private boolean isStringInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException ex)
        {
            return true;
        }
    }

    public String validateInput(String input1, String operator, String input2) {
        String result = "";
        if (isRoman(input1) ^ isRoman(input2)){
            throw new RuntimeException();
        }
        if (!isRoman(input1) && !isRoman(input2) && (isStringInt(input1) || isStringInt(input1))) {
            throw new RuntimeException();
        }

        int op1 = 0;
        int op2 = 0;

        if(isRoman(input1)) {
            ConvertRoman romanOp = new ConvertRoman();
            op1 = romanOp.romanToInt(input1);
            op2 = romanOp.romanToInt(input2);
        }
        else {
            op1 = Integer.parseInt(input1);
            op2 = Integer.parseInt(input2);
        }

        if (((op1 < 1) || (op1 > 10)) || ((op2 < 1) || (op2 > 10))) {
            throw new RuntimeException();
        }

        if (operator.matches("[-+*/]")){
            throw new RuntimeException();
        }

        if (isRoman(input1)) {
            result = "roman";
        }
        else {
            result = "decimal";
        }

        return result;
    }
}