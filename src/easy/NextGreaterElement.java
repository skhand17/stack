package easy;


import java.util.*;

/*
*Given an array, print the Next Greater Element (NGE) for every element.

The Next Greater Element for an element x is the first greater element on the right side of x in the array.

Elements for which no greater element exist, consider the next greater element as -1.

Examples
Example 1:

 Input: [4, 5, 2, 25]
 Output: [5, 25, 25, -1]
Example 1:

 Input: [13, 7, 6, 12]
 Output: [-1, 12, 12, -1]
Example 1:

 Input: [1, 2, 3, 4, 5]
 Output: [2, 3, 4, 5, -1]
Constraints:

1 <= arr.length <= 104
-109 <= arr[i] <= 109

* */
public class NextGreaterElement {

    public static void main(String[] args) {
//        int [] input = new int[]{4, 5, 2, 25};
        List<Integer> arr = Arrays.asList(11, 13, 21, 3);
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arr2 = Arrays.asList(11, 13, 21, 3);

        List<Integer> result = findNextGreater(arr1);
        for(Integer in : result){
            System.out.print(in + " ");
        }
    }

    public static List<Integer> findNextGreater(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.size() - 1; i>=0; i--){

            while(!stack.isEmpty() && stack.peek() <= arr.get(i)){
                stack.pop();
            }

            result.add(stack.isEmpty() ? -1 : stack.peek());

            stack.push(arr.get(i));
        }

        Collections.reverse(result);
        return result;
    }
}
