public class src_in_twod {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
     /*    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target) return true;
            }
        }
 //this is a brute force approach. Time complexity is O(m*n)
//this code may show a time limit exceeded error for large inputs.
        return false;   */



        //Optimized approach
       int i=0,j=n-1;    
//start from top right corner of the matrix as it is the only corner where we can move in both directions.
        while(i<m && j>=0){   //while we are inside the matrix
            if(matrix[i][j]==target) return true;
            else if(matrix[i][j]>target){   
//if the element is greater than target, then move left
                j--;
            }
            else i++;    
//if the element is smaller than target, then move down
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=3;
        System.out.println(searchMatrix(arr,target));
    }
}
