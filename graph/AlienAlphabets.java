/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.LinkedList; 
import java.math.*; 
import java.util.Stack;
/**
 *
 * @author dichha
 */
class Graph{
    private final LinkedList<Integer>[] adj; 
    public Graph(int n){
        adj = new LinkedList[n]; 
        for(int i=0; i<n; i++){
            adj[i] = new LinkedList<Integer>(); 
        }
    }
    void addEdge(int startVertex, int endVertex){
        adj[startVertex].add(endVertex); 
    }
    
    private int getNoOfVertices(){
        return adj.length; 
    }
    private void topologicalSortUtil(int currentIdx, boolean[] visited, Stack<Integer> stack){
        visited[currentIdx] = true; 
        for(int adjVertex: adj[currentIdx]){
            if(!visited[adjVertex]){
                topologicalSortUtil(adjVertex, visited, stack); 
            }
        }
        stack.push(currentIdx); 
    }
            
    void topologicalSort(){
        boolean[] visited = new boolean[getNoOfVertices()];
        for(int i=0; i<getNoOfVertices(); i++){
            visited[i] = false; 
        }
        Stack<Integer> stack = new Stack<Integer>(); 
        for(int i=0; i<getNoOfVertices(); i++){
            if(!visited[i]){
                topologicalSortUtil(i, visited, stack);
            }
        }
        
        while(!stack.isEmpty()){
            System.out.print((char)('a' + stack.pop()) + " ");
        }
    }
    
}
public class AlienAlphabets {
    private static void printOrder(String[] words, int len){
        Graph graph = new Graph(len); 
        
        for(int i=0; i<len-1; i++){
            
            for(int j=0; j<Math.min(words[i].length(), words[i+1].length()); j++){
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    graph.addEdge(words[i].charAt(j) - 'a', words[i+1].charAt(j)-'a');
                    break; 
                }
            }
        }
        graph.topologicalSort(); 
    }
    /*
    public static void main(String[] args){
        //String[] words = {"baa", "abcd", "abca", "cab", "cad"}; 
        String[] words = {"caa", "aaa", "aab"}; 
        printOrder(words, words.length); 
    }
    */
    
}
