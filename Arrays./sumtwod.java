public class sumtwod {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}}; //declaring and initializing 2D array
        int sum=0;
        int prod=1;
        int m=arr.length; //rows
        int n=arr[0].length; //columns
        for(int i=0;i<m;i++){  //rows
            for(int j=0;j<n;j++){   //columns
   
                sum+=arr[i][j]; //finding the sum of all elements in the 2D array
                prod*=arr[i][j]; //finding the product of all elements in the 2D array
            }

}
        System.out.println("The sum of all elements in the 2D array is: "+sum); //printing the sum of all elements in the 2D array
        System.out.println("The product of all elements in the 2D array is: "+prod); //printing the product of all elements in the 2D array
    }
}
