package easy;


import java.util.Stack;

/*
* Given a positive integer n, write a function that returns its binary equivalent as a string. The function should not use any in-built binary conversion function.

Examples
Example 1:

Input: 2
Output: "10"
Explanation: The binary equivalent of 2 is 10.
Example 2:

Input: 7
Output: "111"
Explanation: The binary equivalent of 7 is 111.
Example 3:

Input: 18
Output: "10010"
Explanation: The binary equivalent of 18 is 10010.
Constraints:

0 <= num <= 109
* */
public class DecimalToBinaryConversion {

    public static void main(String[] args) {
        int num = 2;
        String binary = decimalToBinary(num);
        System.out.println(binary);
    }

    public static String decimalToBinary(int num){
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int actualNumber = num;
        int numOfElementsToPush = 0;
        while(num!= 0){
            num = num / 2;
            stack.push((int)Math.pow(2, numOfElementsToPush));
            numOfElementsToPush++;
        }

        while(!stack.isEmpty()) {

            if(actualNumber >= stack.peek()){
                sb.append("1");
                actualNumber = actualNumber - stack.pop();
            } else {
                sb.append("0");
                stack.pop();
            }
        }

        return sb.toString();
    }
}
