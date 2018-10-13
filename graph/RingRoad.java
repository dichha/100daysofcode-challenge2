/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;
import java.util.LinkedList; 
import java.util.Iterator; 
/**
 *
 * @author dichha
 */
class GraphII{
    LinkedList<Integer>[] adj; 
    
    public GraphII(int v){
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i] = new LinkedList<Integer>(); 
        }
    }
    
    public void addEdge(int src, int dst){
        adj[src].add(dst); 
        //adj[dst].add(src); 
    }
}
public class RingRoad {
    public static String DFSUtil(int s, boolean[] visited, GraphII graph){
        visited[s] = true; 
        Iterator<Integer> it = graph.adj[s].listIterator(); 
        
        while(it.hasNext()){
            int n = it.next(); 
            if(!visited[n]){
                visited[n] = true; 
                DFSUtil(n, visited, graph);
            }else{
                return "RingRoad"; 
            }
        }
        return "TreeStructure";
    }
    
    public static void DFS(int s, GraphII graph, int len){
        boolean[] visited = new boolean[len]; 
        String ans = DFSUtil(s, visited, graph); 
        System.out.println(ans);
    }
    public static void isRingRoad(int[][] matrix){
        GraphII graph = new GraphII(matrix.length); 
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] == 1 && matrix[j][i] == 1){
                    graph.addEdge(i, j); 
                }
            }
        }
        
        DFS(1, graph, matrix.length); 
    }
    public static void main(String[] args){
        /*
        int[][] matrix = new int[][]{
            
            {1, 1, 1, 0},
            {1, 1, 0, 1}, 
            {1, 0, 1, 1}, 
            {0, 1, 1, 1}

        };
        */
        
        int[][] matrix = new int[][]{
            {1, 1, 0, 1}, 
            {1, 1, 1, 0}, 
            {0, 1, 1, 0}, 
            {1, 0, 0, 1}
        }; 
        
        
        
        isRingRoad(matrix);
    }
    
}
