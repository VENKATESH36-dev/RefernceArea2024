package test1;

import java.util.Stack;

public class ValidParenthsis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "{[()]}";
		boolean result = isValidParenthsis(str);
		System.out.println(result==true?"yes it's Valid Parenthsis":"not a Valid Parenthsis");
	}
	
	public static boolean isValidParenthsis(String str) {
		
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(') {
				st.push(str.charAt(i));
			}else if(!st.isEmpty() && ((str.charAt(i)=='}'&&st.peek()=='{') || (str.charAt(i)==']'&&st.peek()=='[') || (str.charAt(i)==')'&&st.peek()=='(')) ) {
				st.pop();
			}else {
				st.push(str.charAt(i));
			}
		}
		
		
		return st.isEmpty()?true:false;
	}
}
