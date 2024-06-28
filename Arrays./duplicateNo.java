public class duplicateNo {
//remove duplicate no from array
    public static int removeDup(int arr[]){
       int n= arr.length;
         if(n==0 || n==1){
              return n;
         }
         //creating temp array to store unique element
            int[] temp = new int[n];
             //to have a count of unique element
            int j=0;  
            for(int i=0;i<n-1;i++){
                if(arr[i]!=arr[i+1]){
                    temp[j++]=arr[i];
                }
            }
            temp[j++]=arr[n-1];
            // now changing original array to temp array
            for(int i=0;i<j;i++){
                arr[i]=temp[i];
            }
            return j;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4,4, 5,6,6,7,9,10};
        int n=removeDup(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}