public class upperbound {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,80,90,100};
        //             0   1   2   3   4   5   6   7  8   9    10
        int n=arr.length;
        int ub=n;
        int x=80;
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>x){
                ub=Math.min(ub, mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;}
        }
        System.out.println(ub);
    }
}
