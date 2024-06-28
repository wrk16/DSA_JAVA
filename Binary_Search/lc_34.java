public class lc_34 {
    public int[] searchRange(int[] arr, int target) {
        int n=arr.length;
        int ans[]={-1,-1};
//first check the target is present or not usng binary search
        int hi=n-1;  int lo=0;
        boolean flag=false;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]<target)  lo=mid+1;
            else if (arr[mid]> target)   hi=mid-1;
            else {  
                flag=true;  break;   
            }
        }
        if(flag==false) return ans;
//if target is present then find the lower bound
        int lb=n;
        lo=0; hi=n-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb, mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;}
        }
        ans[0]=lb;
//if target is present then find the upper bound
        int ub=n;
        lo=0; hi=n-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if(arr[mid]>target){
                ub=Math.min(ub, mid);
                hi=mid-1;
            }
            else{
                lo=mid+1;}
        }
        ans[1]=ub-1;
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        lc_34 obj=new lc_34();
        int ans[]=obj.searchRange(arr, target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
