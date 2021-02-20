package leetcode.dynamicProgramming;

public class UniquePathsII62 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] map = new int[m][n];
        
        for(int i = 0; i<m;i++){
            if(obstacleGrid[i][0] == 0){
                map[i][0] = 1;
            }else{
                break;
            }        
        }
        
        for(int j= 0;j<n;j++){
            if(obstacleGrid[0][j] == 0){
                map[0][j]=1;
            }else{
                break;
            }    
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    map[i][j]=0;
                }
                else{
                    map[i][j] = map[i-1][j]+map[i][j-1];
                }
                
            }
        }
        return map[m-1][n-1];
    } 
}
