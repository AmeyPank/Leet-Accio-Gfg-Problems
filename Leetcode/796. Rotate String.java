class Solution {
    public boolean rotateString(String s, String goal) {
       String ans = s+s;

       if(s.length() != goal.length()){
           return false;
       } 

       if(ans.indexOf(goal)==-1){
           return false;
       }
       else{
           return true;
       }
    }
}