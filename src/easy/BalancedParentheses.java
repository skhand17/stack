package easy;


import java.util.Stack;

/*
* Given a string s containing (, ), [, ], {, and } characters. Determine if a given string of parentheses is balanced.

A string of parentheses is considered balanced if every opening parenthesis has a corresponding closing parenthesis in the correct order.

Example 1:

Input: String s = "{[()]}";
Expected Output: true
Explanation: The parentheses in this string are perfectly balanced. Every opening parenthesis '{', '[', '(' has a corresponding closing parenthesis '}', ']', ')' in the correct order.

Example 2:

Input: string s = "{[}]";
Expected Output: false
Explanation: The brackets are not balanced in this string. Although it contains the same number of opening and closing brackets for each type, they are not correctly ordered. The ']' closes '[' before '{' can be closed by '}', and similarly, '}' closes '{' before '[' can be closed by ']'.

Example 3:

Input: String s = "(]";
Expected Output: false
Explanation: The parentheses in this string are not balanced. Here, ')' does not have a matching opening parenthesis '(', and similarly, ']' does not have a matching opening bracket '['.

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'
*
*
*
* */
public class BalancedParentheses {

    public static void main(String[] args) {
        String test1 = "{[()]}";
        String test2 = "{[}]";
        String test3 = "(]";

        boolean isTest1Valid = isValid(test1);

        boolean isTest2Valid = isValid(test2);


        boolean isTest3Valid = isValid(test3);


        System.out.println(isTest1Valid);
        System.out.println(isTest2Valid);
        System.out.println(isTest3Valid);
    }

    public static boolean isValid(String test1) {

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<test1.length(); i++){

            char ch = test1.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(')
                stack.push(ch);
            else {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (ch == '}' && top!= '{')
                    return false;
                if (ch == ']' && top!= '[')
                    return false;
                if (ch == ')' && top!='(')
                    return false;
            }
        }

        return stack.isEmpty();

    }

}
