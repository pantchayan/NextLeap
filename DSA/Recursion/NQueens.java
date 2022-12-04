import java.util.*;
public class NQueens {

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    static int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}};
	public static List<List<String>> solveNQueens(int n) {
        
        List<List<String>> ans = new ArrayList<>();
        printNQueens(new int[n][n], ans, 0);

		return ans;
	}

    public static void printNQueens(int[][] chess, List<List<String>> ans, int row){
        if(row == chess.length){
            ArrayList<String> base = new ArrayList<>();
            for(int i=0;i<chess.length;i++){
                String str = "";
                for(int j=0;j<chess[0].length;j++){
                    if(chess[i][j] == 0) str += ".";
                    else str+= "Q";
                }
                base.add(str);
            }
            ans.add(base);

            return;
        }
        for(int col = 0; col < chess.length; col++){
            if(chess[row][col] == 0 && check(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess, ans, row + 1);
                chess[row][col] = 0;
            }
        }
    }

	public static boolean check(int[][] board, int r, int c){
		for(int k=0;k<dir.length;k++){
			int i = r;
			int j = c;
			while(i< board.length && j< board[0].length && i >=0 && j>=0){
			
				if(board[i][j] == 1){
					return false;
				}

                i += dir[k][0];
				j += dir[k][1];
			}
		}
		return true;
	}
}
