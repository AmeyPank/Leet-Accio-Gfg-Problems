class Solution {
    public int numberOfSteps(int n) {
        return help(n, 0);
    }

    int help(int n , int step){

        if(n==0){
            return step;
        }
        if(n % 2 == 0){
            n /= 2;
        }
        else{
            n -= 1;
        }
        return help(n, step+1);
    }
}