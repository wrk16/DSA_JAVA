public class smallest_divisor_givenThreshold {
    public static int smallestDivisor(int[] arr, int t) {
        int n=arr.length;
        //find the maximum element in the array
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx, arr[i]);
        }
        //use binary search to find the smallest divisor 
        int d=1;
        int lo=1;  int hi=mx;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int s=0;
            for(int i=0;i<n;i++){   //calculate the sum of the elements after dividing by mid
                if(arr[i]%mid==0)   s=s+arr[i]/mid;
                else    s=s+arr[i]/mid+1;
            }
            //here we are checking if the sum is less than or equal to the threshold then we will update the divisor and search in the left half else we will search in the right half
            if(s<=t){
                d=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }

        }
        return d;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,9};
        int t=6;
        System.out.println(smallestDivisor(arr,t));
    }
}
