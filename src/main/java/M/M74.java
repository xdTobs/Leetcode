package M;

public class M74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length,cols = matrix[0].length;
        int l = 0,r= (rows*cols)-1;

        while (l <= r) {
            int mid = (l+r)/2;
            int[]coords =getCoords(mid,rows,cols);
            if(matrix[coords[0]][coords[1]]==target)
                return true;
            else if(matrix[coords[0]][coords[1]]<target)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
    public static int[] getCoords(int index, int rows, int cols) {
        int[] res = new int[2];
        res[1]= index%cols;
        int count =0;
        while (index >= cols) {
            count++;
            index-=cols;
        }
        res[0]=count;
        return res;
    }

    public static void main(String[] args) {
        int[] row0 = new int[]{1};
        int[] row1 = new int[]{3};
        int[][]matrix = new int[][]{row0,row1};
        System.out.println(searchMatrix(matrix,3));
    }
}
