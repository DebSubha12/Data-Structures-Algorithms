public class NearlySorted {

    public  static int NearlySortedArray(int arr[],int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
             if (arr[mid-1]>start && arr[mid-1]==target) {
                 return mid-1;
                
             }
             if (arr[mid+1]<end && arr[mid+1]==target) {
                return mid+1;
             }

             if (target<=arr[mid]) {
                end=mid-2;
             }else{
                start=mid+2;
             }
             
        }
        return -1;
    }
public static void main(String[] args) {
            int arr[]={10, 3, 40, 20, 50, 80, 70};
            int target=40;
            int result = NearlySortedArray(arr, target);
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
        }
}