public class capToShip_in_dDays {
    public int shipWithind(int[] arr, int d) {
        int n=arr.length;
        int sum=0, mx=Integer.MIN_VALUE;
//find the sum and maximum element in the array
        for(int i=0;i<n;i++){
            mx=Math.max(mx, arr[i]);
            sum+=arr[i];
        }
//use binary search to find the minimum weight capacity
        int lo=mx, hi=sum, minCap=sum;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isPossible(mid, arr, d)  ==true){   //if it is possible to ship in d days then update the minCap and search in the left half else search in the right half and return the minCap(minimum weight capacity)
                minCap=mid;
                hi=mid-1;
            }
            else     lo=mid+1;
        }
        return minCap;
    }
//function to check if it is possible to ship in d days with the given weight capacity or not 
    public boolean isPossible(int cap, int[] arr, int d) {
        int n=arr.length;
        int load =0;
        int days=1;
        for(int i=0;i<n;i++){
            if(load+arr[i]<=cap){   //if the load and the current weight is less than the capacity then add the weight to the load else update the load to the current weight and increase the days and return false if days are greater than d(here d is the number of days in which we have to ship the weights)
                load +=arr[i];
            }
            else{
                load=arr[i];
                days++;
            } }
            if(days>d)  return false;
            else return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int d=5;
        capToShip_in_dDays obj=new capToShip_in_dDays();
        System.out.println(obj.shipWithind(arr, d));
    }
    
}
