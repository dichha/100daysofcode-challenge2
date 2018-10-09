/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.util.Arrays;
import java.util.Random; 
/**
 *
 * @author dichha
 */
public class Shuffle{ 
    // Fisher-Yates problem

    /**
     * @param args the command line arguments
     */
    
    public static int[] shuffle(int[] arr){
        Random rand = new Random(); 
        
        for(int i=arr.length-1; i >= 1; i--){
            int idx = rand.nextInt(i); 
            int temp = arr[idx]; 
            arr[idx] =  arr[i]; 
            arr[i] = temp; 
        }
        return arr; 
    }
    /*
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {1, 2, 3, 4, 5}; 
        int[] res = shuffle(arr);
        System.out.println(Arrays.toString(res));
    }
    */
}
