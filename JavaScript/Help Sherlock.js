/*Sherlock is a great detective but he is weak in maths. On one day Sherlock wants to divide N apples into M people but he is not sure whether he can divide them equally or not. Your task is to help Sherlock to solve the problem.

Input Format
User Task: Since this will be a functional problem, you don't have to take input. You just have to complete the function Help() that takes integers N and M as arguments.

Output Format
Return 1 if it is possible to divide N apple among M people else return 0.

Example 1
Input

 6 2

Output

1

Explanation

 both people will get 3 apples each.

Input

  3 4


Output

0

Explanation

No way to divide*/

function Help(N, M) {
    //complete this function
    //do not console.log here
      if (N % M === 0) {
      return 1;
    } else {
      return 0;
    }
   
  }