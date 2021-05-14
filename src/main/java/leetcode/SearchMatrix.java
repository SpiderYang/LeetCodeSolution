package leetcode;


/*
编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。


 */


public class SearchMatrix {
    private static boolean searchMatrix(int[][] matrix, int target ){
        /*
        由于是有序的，从二维数组中第一行，最后一列开始搜索并判断大小。
         */
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >=0 && row < matrix.length ){
            if (target == matrix[row][col])
                return true;
            else if (target > matrix[row][col])
                row++;
            else
                col--;
        }
        return false;
    }
}
