public class rotate90deg {
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
            int m=arr.length; //rows
            for(int i=0;i<m;i++){  //rows
                for(int j=0;j<i;j++){   //columns
//j<i because we want to swap only the upper triangle elements
 //step 1: Transpose
                    int swap=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=swap;
                }
            }
            System.out.println("After Transpose: ");
            print(arr);
            //step 2: Reverse each row
            for (int i = 0; i < m; i++) { //loop for rows
                int a=0, b=m-1; 
//a=starting index, b=ending index
//swap arr[i][a] with arr[i][b] 
                while(a<b){
                int swap=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=swap;
                a++;
                b--;
                
            }
            }
            System.out.println("After Rotating 90 degrees: ");
            print(arr);

        }
}
