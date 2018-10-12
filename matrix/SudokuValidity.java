/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.util.Set; 
import java.util.HashSet; 

/**
 *
 * @author dichha
 */
public class SudokuValidity {
    public static boolean checkValidity(char[][] board){
        
        if(board == null || (board[0].length != board.length)){
            return false; 
        }
        
        // check row validity
        for(int i=0; i<board.length; i++){
            boolean[] m = new boolean[board.length]; 
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] != '.'){
                    if(!m[(int)(board[i][j]) - '1']){
                        return false; 
                    }else{
                        m[(int)(board[i][j]- '1')] = true;  
                    }
                }
            }
        }
        // check col validity
        for(int i=0; i<board[0].length; i++){
            boolean[] m = new boolean[board.length]; 
            for(int j=0; j<board.length; j++){
                if(board[i][j] != '.'){
                    if(!m[(int)(board[i][j]) - '1']){
                        return false; 
                    }else{
                        m[(int)(board[i][j]- '1')] = true;  
                    }
                }
            }
        }
        
        // check n*n matrix
        for(int block=0; block < board[0].length; block++){
            boolean[] m = new boolean[board.length];
            for(int i=block/3*3; i<block/3+3; i++){
                for(int j=block%3*3; j< block%3+3; j++){
                    if(board[i][j] != '.'){
                        if(!m[(int) (board[i][j] - '1')]){
                            return false; 
                        }else{
                            m[(int)(board[i][j])-'1'] = true; 
                        }
                    }
                    
                }
            }
        }
        return true; 
        
    
    }
    /*
    public static void main(String[] args){
        char[][] board = new char[][]{
            {'.', '2', '.'}, 
            {'1', '3', '.'}, 
            {'2', '.', '3'}
        }; 
        boolean ans = checkValidity(board); 
        System.out.println(ans);
    }
    */
    
}
