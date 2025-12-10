class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        int count = 0;
        int n = grid.length;
        for(int i =0 ;i<n;i++){
            List<Integer> rows = new ArrayList();
            for(int j = 0;j<n;j++){
                rows.add(grid[i][j]);
            }
            map.put(rows,map.getOrDefault(rows,0)+1);
        }

        for(int i = 0; i< n ; i++){
            ArrayList<Integer> cols = new ArrayList();
            for(int j = 0; j<n;j++){
                cols.add(grid[j][i]);
            }
            count+= map.getOrDefault(cols,0);
        }
        return count;
        
        
    }
}