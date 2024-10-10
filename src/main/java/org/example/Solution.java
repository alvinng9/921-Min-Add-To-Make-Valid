package org.example;

import java.util.Stack;

public class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push('(');
            } else {
                if (stack.empty()) {
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        return count + stack.size();
    }
}
