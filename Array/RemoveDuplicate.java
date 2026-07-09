package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int n = arr.length;
        int j = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                j++;
            }
        }

        System.out.println(j );
    }
}
