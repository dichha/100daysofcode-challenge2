/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;

import java.util.Stack; 
/**
 *
 * @author dichha
 */
public class QueueUsingStacks {
    static Stack<Integer> stack1 = new Stack<Integer>(); 
    static Stack<Integer> stack2 = new Stack<Integer>(); 
    
   
    
    public static void enqueue(int n){
        stack1.push(n); 
    }
    
    public static int dequeue(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            return -1; 
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop()); 
            }
        }
        return stack2.pop(); 
    }
    
    /*
    public static void main(String[] args){
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1); 
        q.enqueue(2); 
        q.enqueue(3); 
        System.out.println(q.dequeue()); 
        q.enqueue(4); 
        System.out.println(q.dequeue());
    }
    */
    
}
