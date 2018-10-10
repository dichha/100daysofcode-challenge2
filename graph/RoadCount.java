/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author dichha
 */
public class RoadCount {
    public static int roadCount(int[][] arr){
        int res = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                res += arr[i][j];
            }
        }
        // not oriented graph
        return res/2; 
    }
    /*
    public static void main(String[] args){
        int[][] arr = {{0, 1, 0, 0, 0}, 
            {1, 0, 1, 1, 0}, 
            {0, 1, 0, 0, 0}, 
            {0, 1, 0, 0, 0}, 
            {0, 0, 0, 0, 0}
        }; 
        
        int res = roadCount(arr); 
        System.out.println(res);
    }
    */
    
}
