public class nxtgrtele {
    public static void main(String[] args) {
        int arr1[]={12,8,60,37,2,49,16,28,21};
        int n=arr1.length;
        int arr2[]=new int[n];
        arr2[n-1]=-1;
        //brute force approach
      /*  for(int i=0;i<n-1;i++){
            int mx=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                    mx=Math.max(mx,arr1[j]);
                }
                arr2[i]=mx;
            }*/

            //Optimized approach
            int nge=arr1[n-1];
            for(int i=n-2;i>=0;i--){
                arr2[i]=nge;
                 nge=Math.max(arr1[i],nge);
            }
            //printing the array
            for(int i=0;i<n;i++){
                System.out.print(arr2[i]+" ");
            }
            
        }
        }
    

