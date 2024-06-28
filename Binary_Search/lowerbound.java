public class lowerbound {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int n=arr.length;
        int lb=n;
        int x=2;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>=x){
                lb=Math.min(lb, mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;}
        }
        System.out.println(lb);
    }
}
