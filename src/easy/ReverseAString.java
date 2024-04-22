package easy;

import java.util.Stack;

/*
* Given a string, write a function that uses a stack to reverse the string. The function should return the reversed string.

Examples
Example 1:

Input: "Hello, World!"
Output: "!dlroW ,olleH"
Example 2:

Input: "OpenAI"
Output: "IAnepO"
Example 3:

Input: "Stacks are fun!"
Output: "!nuf era skcatS"
Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.
*
* */
public class ReverseAString {

    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = "OpenAI";
        String str3 = "Stacks are fun";

        String reverse = reverseString(str3);
        System.out.println(reverse);
    }


    public static String reverseString(String str) {

        if(str == null)
            return null;

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch: str.toCharArray()){
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
