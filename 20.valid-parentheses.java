import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
  Deque <Character> stack = new ArrayDeque<Character>();
    for (int i = 0; i < s.length(); i++) {
         char x = s.charAt(i);
        if(x=='('||x=='{'||x=='['){
            stack.push(x);
            continue;
        }
        if(stack.isEmpty())return false;
       char check ;
       switch(x){
          case ')' :check=stack.pop();
                   if(check=='{'||check=='[') return false;
                    break; 
          case '}' :check=stack.pop();
                    if(check=='('||check=='[') return false;
                      break; 
        case ']' :check=stack.pop();
                  if(check=='{'||check=='(') return false;
                 break; 
       }
    }
        return stack.isEmpty();
    }
}
// @lc code=end

