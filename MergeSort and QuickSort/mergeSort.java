public class mergeSort {
    public static void main(String[] args) {
        
        int[] arr = {12, 11, 13, 5, 6, 7};
        mergesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergesort(int[] arr){
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
        merge(a, b, arr);

    } 

    public static void merge(int[] a, int[] b, int[] arr){
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                arr[k]=a[i];
                i++;
            }else{
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


}
