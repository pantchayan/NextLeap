import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int[][] dir = {{0,1}, {1,0}, {0,-1},{-1,0}};

        List<Integer> ans = new ArrayList<>();
        
        int count = 1;
        boolean flag = true;
        int i = 0;
        int j = 0;
        ans.add(matrix[0][0]);
        matrix[0][0] = -1000;
        while(flag){
            
            for(int d=0;d<dir.length;d++){
                while(i+dir[d][0]>=0 && j+dir[d][1]>=0 && i+dir[d][0]<matrix.length && j+dir[d][1]<matrix[0].length && matrix[i+dir[d][0]][j+dir[d][1]] != -1000){
                    int r = i+dir[d][0];
                    int c = j+dir[d][1];
                    ans.add(matrix[r][c]);
                    matrix[r][c] = -1000;
                    i = r;
                    j = c;
                    count++;
                }    
            }
            
            if(count >= matrix.length * matrix[0].length){
                flag = false;
            }
        }
         
        return ans;

    }
}
