/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;
import java.util.*; 


/**
 *
 * @author dichha
 */
public class AscendingStacks {
    public static Stack<Integer> ascend(Stack<Integer> stack){
        if(stack == null || stack.isEmpty()){
            return stack; 
        }
        
        Stack<Integer> stack2 = new Stack<Integer>(); 
        while(!stack.isEmpty()){
            int tmp = stack.pop(); 
            
            while(!stack2.isEmpty() && stack2.peek() < tmp){
                stack.push(stack2.pop()); 
            }
            stack2.push(tmp);
        }
        return stack2; 
    } 
    /*
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>(); 
        stack.push(24); 
        stack.push(21); 
        stack.push(2); 
        stack.push(41); 
        stack.push(-2); 
        stack.push(3); 
        stack.push(25); 
        stack.push(7);
        
        Stack<Integer> res = ascend(stack); 
        
        while(!res.isEmpty()){
            System.out.print(res.pop() + " "); 
        }
    }
    */
}
