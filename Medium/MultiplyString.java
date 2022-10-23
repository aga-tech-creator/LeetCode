public class MultiplyString {
    class Solution {
        public String multiply(String num1, String num2) {
            char[] num1Chars = num1.toCharArray();
            char[] num2Chars = num2.toCharArray();
            char[] resultChars = new char[num1.length() + num2.length() - 1];
            int asciiJokerVal = 48;
            int actualVal = 0, nextVal = 0, algNum1 = 0, algNum2 = 0;
            String result = "";

            if (num1.equals("0") || num2.equals("0"))
                return "0";

            for (int i = num1.length() - 1; i >= 0; i--) {

                for (int j = num2.length() - 1; j >= 0; j--) {
                    algNum1 = num1Chars[i] - asciiJokerVal;
                    algNum2 = num2Chars[j] - asciiJokerVal;

                    if (resultChars[i + j] == 0)
                        actualVal = resultChars[i + j];
                    else
                        actualVal = resultChars[i + j] - asciiJokerVal;

                    actualVal = actualVal + algNum1 * algNum2;
                    resultChars[i + j] = (char) ((actualVal % 10) + asciiJokerVal);
                    nextVal = actualVal / 10;
                    if (!(i == 0 && j == 0)) {

                        if (resultChars[i + j - 1] == 0)
                            resultChars[i + j
                                    - 1] = (char) ((resultChars[i + j - 1] + nextVal) + asciiJokerVal);
                        else
                            resultChars[i + j
                                    - 1] = (char) (((resultChars[i + j - 1] - asciiJokerVal) + nextVal)
                                            + asciiJokerVal);
                    } else {

                        if (actualVal >= 10)
                            result = (char) (nextVal + asciiJokerVal) + String.copyValueOf(resultChars);
                        else
                            result = String.copyValueOf(resultChars);
                    }

                }
            }

            return result;
        }
    }
}
