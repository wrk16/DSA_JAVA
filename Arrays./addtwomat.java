public class addtwomat {
    public static void main(String[] args) {
        int a[][]={{1,9,2},{3,7,4},{8,5,6}};
        int b[][]={{9,3,7},{8,6,5},{2,4,1}};
        int m=a.length; //rows
        int n=b[0].length; //columns
        // int res[][]=new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         res[i][j]=a[i][j]+b[i][j];
        //     }
        // }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(res[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        //without making a new array------just keep storing the sum in the first array i.e. in a.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]+=b[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
