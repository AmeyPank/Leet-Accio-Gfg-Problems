class Solution {
    void segregate0and1(int[] arr, int n) {
        // code here
        int zero = 0;
        
        for(int i = 0; i<n ; i++){
            if(arr[i]==0){
                zero++;
            }
        }
        
        int i = 0;
        while(i<zero){
            arr[i]= 0 ;
            i++;
        }
        
        while(i<n){
            arr[i]=1;
            i++;
        }
    }

}