public class countInversion {
    static int count = 0;
    public static void mergesort(int arr[]){
        if(arr.length < 2){
            return;
        }
        int a[]=new int[arr.length/2];
        int b[]=new int[arr.length - a.length];
        for(int i=0; i<a.length; i++){
            a[i]=arr[i];
        }
        for(int i=0; i<b.length; i++){
            b[i]=arr[i+a.length];
        }
        mergesort(a);
        mergesort(b);
        inversion(a,b);
        merge(a, b, arr);
    }

     public static void inversion(int[] a, int[] b){
         int i=0, j=0;
         while(i<a.length && j<b.length){
             if(a[i] > b[j]){
                 count += a.length - i;
                 j++;
             }else{
                 i++;
             }
         }
     }

    public static void merge(int[] a, int[] b, int[] arr){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                arr[k]=a[i];
                i++;
            }else  // if a[i] > b[j]  which is the condition for inversion so we don't have to make an extra function for inversion
            {
                //count += a.length-i; // if a[i] > b[j] then all the elements after a[i] in a[] will be greater than b[j] so we add the count of all such elements to the count
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {109,33,89,27,60,10,70};
        mergesort(arr);
        System.out.println("Number of inversions: " + count);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
