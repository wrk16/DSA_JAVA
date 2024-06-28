public class multiplytd {
    public static void print(int arr[][]){
        int m=arr.length; //rows
        int n=arr[0].length; //columns
        for(int i=0;i<m;i++){  //rows
            for(int j=0;j<n;j++){   //columns
                System.out.print(arr[i][j]+" "); //printing 2D array
            }
            System.out.println(); //for new line
        }
        }
    public static void main(String[] args) {
        int a[][]={{1,2,1},{2,1,2}};
        int b[][]={{1,0,1,2},{2,1,0,0},{0,3,1,1}};  //2*3   3*4 = 2*4
        if (a[0].length==b.length) {
            int c[][]=new int[a.length][b[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<b[0].length;j++){
                    for(int k=0;k<a[0].length;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            print(a );
            System.out.println("*");
            print(b);
            System.out.println("=");
            print(c);
        }
        else{
            System.out.println("Matrix multiplication not possible");
            
        }
    }
    
}