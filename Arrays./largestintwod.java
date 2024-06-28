public class largestintwod {
    public static void main(String[] args) {
        int arr[][]={{11,2,3},{4,5,6},{7,8,9}}; //declaring and initializing 2D array
        int mx=Integer.MAX_VALUE;
        int m=arr.length; //rows
        int n=arr[0].length; //columns
        for(int i=0;i<m;i++){  //rows
            for(int j=0;j<n;j++){   //columns
                // if(arr[i][j]>mx){
                //     mx=arr[i][j];
                    mx=Math.min(mx,arr[i][j]); //finding the largest element in the 2D array
                    /*
                     mx=Math.max(mx,arr[i][j]); by replacing line 9 and 10.
                     */
                }
            }
            System.out.println("The smallest element in the 2D array is: "+mx); //printing the largest element in the 2D array
        }
    
    }

