public class wavetd {
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
            int arr[][]={{1,2,3},{4,5,6},{7,8,9}}; //declaring and initializing 2D array
            print(arr);
            System.out.println("Wave Traversal: ");
            int m=arr.length; //rows
            int n=arr[0].length; //columns
            for(int i=0;i<m;i++){  //rows
                if(i%2==0){
                    for(int j=0;j<n;j++){
                        System.out.print(arr[i][j]+" ");
                    }

                }
                else{
                    for(int j=n-1;j>=0;j--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
            }
}
}
