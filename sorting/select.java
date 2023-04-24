
public class select {

    public static void unsorted(int arr[]) {
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }


    public static void printarray(int arr[]) {
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,9,5,6,2  };

        System.out.print("unsorted array : ");
        unsorted(arr);



        for(int i=0;i<arr.length-1;i++){
            int samllest=i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[samllest]>arr[j]){
                    samllest=j;
                }
            int temp = arr[samllest];
            arr[samllest]=arr[i];
            arr[i]=temp;}}
    

    System.out.print("sorted array : ");

    printarray(arr);

    }
}
