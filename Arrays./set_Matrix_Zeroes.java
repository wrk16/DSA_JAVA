public class set_Matrix_Zeroes {

    public static void setZeroes(int[][] matrix) {

//brute force approach: this approach uses O(m*n) space and gives the time complexity as O(m*n).
      /*  int m=matrix.length;
        int n=matrix[0].length;
        int helper[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
//deepcopy the original matrix to helper matrix
                helper[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper[i][j]==0){
//set the ith row and jth column to zero in the original matrix
                    for(int b=0;b<n;b++){
                        matrix[i][b]=0; 
//set the ith row to zero in the original matrix
                    }
                    for(int a=0;a<m;a++){
                        matrix[a][j]=0;
//set the jth column to zero in the original matrix
                    }
                }
            }
        }    */
//optimized approach: this approach uses O(m+n) space and gives the best time complexity as O(m*n).
        int m=matrix.length;
        int n=matrix[0].length;
        boolean row[]=new boolean[m];
        boolean col[]=new boolean[n];
//marking the particular row and column as true if the element is zero
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){  //if the element is zero
                    row[i]=true; //mark the ith row as true
                    col[j]=true;  //mark the jth column as true

                }
            }
        }
//set the 'true' row to zero
        for(int i=0;i<m;i++){
            if(row[i]==true){  //if the ith row is true
                for(int j=0;j<n;j++){   //the col varries from 0 to n , row is fixed
                    matrix[i][j]=0;  //set the ith row to zero
                }
            }
        }
//set the 'true' column to zero
        for(int j=0;j<n;j++){
            if(col[j]==true){  //if the jth column is true
                for(int i=0;i<m;i++){  //the row varries from 0 to m , column is fixed
                    matrix[i][j]=0;  //set the jth column to zero
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }        
    }
}
