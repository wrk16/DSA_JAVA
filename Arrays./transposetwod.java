public class transposetwod {
    public static void main(String[] args) {
        int arr[][]={{1,9},{3,7},{8,5}};
        int m=arr.length; //rows
        int n=arr[0].length; //columns
        //int res[][]=new int[m][n];
        int res[][]=new int[n][m];
        for (int i = 0; i < m; i++) { //rows
            for(int j=0;j<n;j++){  //columns
                res[j][i]=arr[i][j];   
//transpose karne ke liye bus row and column ko interchange karna hota hai.
            }   
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    } 
}