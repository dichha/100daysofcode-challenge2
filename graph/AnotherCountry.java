/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;
import java.util.LinkedList; 
import java.util.Stack; 
import java.util.Iterator; 
/**
 *
 * @author dichha
 */
class GraphI{
    LinkedList<Integer>[] adj; 
    public GraphI(int v){
        adj = new LinkedList[v]; 
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>(); 
        } 
    }
    
    public void addEdge(int src, int dst){
        adj[src].add(dst); 
        adj[dst].add(src); 
    }
    
    
    
}
public class AnotherCountry {
    public static void BFS(GraphI graph, int s, boolean[] visited, int c){
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
        queue.add(s); 
        visited[s] = true;
        while(queue.size() > 0){
            s = queue.poll(); 
            Iterator<Integer> it = graph.adj[s].listIterator(); 
            while(it.hasNext()){
                int n = it.next(); 
                if(!visited[n]){
                    visited[n] = true; 
                    queue.add(n); 
                }
            }
            
        }
        // check # of visited vertex
        int count = 0; 
        for(int i=1; i<visited.length; i++){
            if(visited[i]){
                count++; 
            }
        }
        if(count == c){
            System.out.println("YES"); 
        }else{
            System.out.println("NO");
        }
        
    }
    
    public static void checkAnotherCountry(int c, int r){
        GraphI graph = new GraphI(c+1);
        graph.addEdge(1, 2);
        graph.addEdge(4, 5);
        /*
        graph.addEdge(1, 2); 
        graph.addEdge(3, 4); 
        graph.addEdge(5, 2); 
        graph.addEdge(4, 5); 
        */
        boolean[] visited = new boolean[c+1];
        BFS(graph , 1, visited, c); 
         
        
    }
    
    /*
    public static void main(String[] args){
        checkAnotherCountry(5, 2);  
        
    }
    */
}
