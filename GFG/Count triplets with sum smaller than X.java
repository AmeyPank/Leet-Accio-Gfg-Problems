class Solution
{
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        int c = 0;
        
        for(int i = 0;i<arr.length-2;i++){
            int start = i+1;
            int end = arr.length -1;
            
            while(start<end){
                long t = arr[i] + arr[start] + arr[end];
                
                if(t< sum){
                    c =  c + end -start;
                    start++;
                }else{
                    end--;
                }
            }
        }
        return c;
        
    }
}