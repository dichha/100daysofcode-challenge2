/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacksandqueues;

import java.util.Queue; 
import java.util.LinkedList; 

/**
 *
 * @author dichha
 */
public class StackUsingQueue {
    Queue<Integer> q = new LinkedList<Integer>(); 
    
    void push(int n){
        int size = q.size(); 
        q.add(n); 
        
        for(int i=0; i<size; i++){
            int x = q.remove(); 
            q.add(x); 
        }
    }
    int pop(){
        if(!q.isEmpty()){
            return q.remove(); 
        }else{
            System.out.println("Queue is empty.");
            return -1; 
        }
        
    }
    
    int peek(){
        if(!q.isEmpty()){
            return q.peek();
        }
        System.out.println("Empty.");
        return -1; 
    }
    /*
    public static void main(String[] args){
        StackUsingQueue suq = new StackUsingQueue(); 
        suq.push(0);
        suq.push(1);
        suq.push(3);
        System.out.println(suq.pop()); 
        System.out.println(suq.peek());
        
    }
    */
}
