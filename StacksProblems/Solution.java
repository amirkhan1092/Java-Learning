package StacksProblems;

import java.util.Stack;
// Java program to check for balanced parentheses in an expression

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for(int i=0; i<s.length(); i++){
            
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                 st.push(s.charAt(i));
            }
            else{
    if(st.isEmpty()){
        return false;
    }
        char top = st.pop();
        if(!((top == '{' && s.charAt(i) == '}') || (top == '[' && s.charAt(i) == ']') || (top == '(' && s.charAt(i) == ')'))) {
            return false;
        }
    }
            }
    return st.isEmpty();
        }

    public static void main(String arg[]){
        String s = "({";
        System.out.println(isValid(s));
    }

    }
