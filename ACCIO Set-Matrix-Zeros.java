//Approach 1:
//
//        We break the problem into two parts the first row and first column and the remaining matrix. 
//        First we check if there is any element 0 present in first row/column and mark two flags true if so. 
//        Next we check all the elements other than the first row and first column if there is any zero present 
//        we mark that element's first row and column as 0. Next we again check all the elements other than the 
//        first row and first column if that element's row or column has zero, we mark that element as zero. 
//        Finally we use the two flags to handle the first row and column.
//
//        Algorithm:
//
//        Make two boolean flags. If any element in first row is 0 mark one true and likewise for the first column.
//        Check all the elements other than the first row and first column if there is any zero present we mark that 
//        lement's first row and column as 0.
//        Again loop through all the elements other than the first row and first column and 
//        if any element has 0 in the first column or first row mark is as 0.
//        Handle the first row and column separately according to their Boolean values.

//        Time Complexity: O(m*n) 
//        
//        Space Complexity: O(1)
//
//        Java

import java.util.*;

public class Main { 
    public static void main(String[] args) throws Throwable { 
        Scanner sc = new Scanner(System.in); int m = sc.nextInt(); 
        int n = sc.nextInt(); 
        int[][] arr = new int[m][n]; 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) { 
                arr[i][j] = sc.nextInt(); 
            } 
        } 
        Solution.setMatrixZeroes(arr); 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) { 
                
                System.out.print(arr[i][j] + " "); 
            } System.out.println(); 
        } 
    } 
} 
class Solution { 
    static void setMatrixZeroes(int[][] matrix) { 
        Boolean isZeroCol = false; 
        Boolean isZeroRow = false; 
        int m = matrix.length; 
        int n = matrix[0].length; 
        for (int i = 0; i < m; i++) { 
            //check the first column 
            if (matrix[i][0] == 0) { 
                isZeroCol = true; break; 
            } 
        } for (int i = 0; i < n; i++) { 
            //check the first row 
            if (matrix[0][i] == 0) { 
                isZeroRow = true; 
                break; 
            } 
        } 
        for (int i = 1; i <m; i++) { 
            //check except the first row and column 
            for (int j = 1; j < n; j++) 
                
                if (matrix[i][j] == 0){ 
                    matrix[i][0] = 0; 
                    matrix[0][j] = 0; 
                } 
            } 
        for (int i = 1; i < m; i++) { 
            
            //process except the first row and column 
            for (int j = 1; j < n; j++) 
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0; 
        } if (isZeroCol) { 
            
            //handle the first column 
            for (int i = 0; i < m; i++) 
                matrix[i][0] = 0; 
        } 
        if (isZeroRow) { 
            
            //handle the first row
            for (int i = 0; i < n; i++) 
                matrix[0][i] = 0; 
                //git management
        } 
    } 
}