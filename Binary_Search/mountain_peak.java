class mountain_peak {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lo=1;  int hi=n-2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])  return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])  lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100,90,80,70,60,50,40,30,20,10};
        mountain_peak obj=new mountain_peak();
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}