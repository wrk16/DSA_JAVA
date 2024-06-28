public class scoreafter_flipping_mat {
    public static void main(String[] args) {
        int arr[][]={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m=arr.length; //rows
        int n=arr[0].length; //columns

        //flip those rows which have 0 at the start
        for(int i=0;i<m;i++){  
            if(arr[i][0]==0){
            //flip that row
                for(int j=0;j<n;j++){
                    if(arr[i][j]==0)     arr[i][j]=1;
                    else   arr[i][j]=0;
            }
        }
        }
        //flip those columns which have more 0s than 1s
        for(int j=1;j<n;j++){  
            int noofZero=0, noofOne=0; 
            for(int i=0;i<m;i++){
                if(arr[i][j]==0)  noofZero++;
                else    noofOne++;
            }
            if(noofZero>noofOne){
                //flip that column
                for(int i=0;i<m;i++){
                    if(arr[i][j]==0)     arr[i][j]=1;
                    else   arr[i][j]=0;
                }
            }
    }
    //converting the binary matrix to decimal
    int sum=0;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            //converting binary to decimal and adding it to sum.
            sum+=arr[i][j]*Math.pow(2,n-j-1);    //2^(n-j-1) is the power of 2 for that bit.
        }
    }
    System.out.println(sum);
}
}