public class rotated_arr {
    public static int search(int arr[], int target) {
        //find pivot
        int n=arr.length;

        //if the arr size<=2 , then apply linear search 
        if(n<=2){
            for(int i=0;i<n;i++){
                if(arr[i]==target) return i;
            }
            return -1;
        }

        int lo=0;  int hi=n-1;
        int p=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                p=mid;
                break;
            }
            else if(arr[mid]<arr[mid-1] && arr[mid]<arr[mid+1]) { p=mid-1; break;}

            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])  {
            if(arr[mid]>arr[n-1]){
                lo=mid+1;
            }
            else hi=mid-1;{
            }
            }
            if(p==-1){ //if array is not rotated
               return binary_search(arr,0,n-1,target);   
            }
            int left=binary_search(arr,0,p,target);
            if(left!=-1) return left;
            int right=binary_search(arr,p+1,n-1,target);
            return right;
    }
        return p;
}

    private static int binary_search(int[] arr, int lo, int hi, int target) {
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi=mid-1;
            else lo=mid+1;
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100,90,80,70,60,50,40,30,20,10};
        int target=80;
        System.out.println(search(arr,target));
    }
}
