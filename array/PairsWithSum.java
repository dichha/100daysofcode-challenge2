/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.List; 
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.Set; 
import java.util.HashSet; 

/**
 *
 * @author dichha
 */
public class PairsWithSum {
    public static List<List<Integer>> getPairs(int[] arr, int sum){
        
        List<List<Integer>> res = new ArrayList<List<Integer>>(); 
        if(arr == null || arr.length < 1){
            return res; 
        }
        
        
        Set<Integer> set = new HashSet<Integer>(); 
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]); 
            if(set.contains(sum - arr[i])){
                res.add(Arrays.asList(new Integer[]{arr[i], sum-arr[i]})); 
            }
            
        }
          
        return res; 
        
        
    }
    /*
    public static void main(String[] args){
        int[] arr = new int[]{8, -3, -1, 3, 4, 5};
        List<List<Integer>> res = getPairs(arr, 7); 
        
        for(List l: res){
            System.out.println(l);
        }
        
    }
    */
}
