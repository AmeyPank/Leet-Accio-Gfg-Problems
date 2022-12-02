import java.util.*;

class Accio{
    static int[][] BooleanMatrixProblem(int m,int n,int[][] mat){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    for(int k=0;k<n;k++){
                        mat[i][k]=1;
                    }
                    break;
                }
            }
        }
        return mat;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int nums[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j] = sc.nextInt();
            }
        }
        Accio obj = new Accio();
        int[][] ans=obj.BooleanMatrixProblem(m,n,nums);
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                System.out.print(ans[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}