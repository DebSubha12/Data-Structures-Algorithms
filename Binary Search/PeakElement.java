public class PeakElement {

    public static int PeakElement(int arr[]){
        int low=0,n=arr.length,high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;

            // Case 1: mid is in between
            if(mid>0 && mid<n-1){
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                    return mid;
                }
            
            else if(arr[mid-1]>arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }
        // Case 2: mid is first element
             else if(mid==0){
            if(arr[0]>arr[1]){
                return 0;
            }else{
                return 1;
            }
        }

        // Case 3: mid is last element
        else if(mid==n-1){
            if(arr[n-1]>arr[n-2]){
                return n-1;
            }else{
                return n-2;
            }
        }
        }
      return -1;

    }
    public static void main(String[] args) {
        int arr[]={5,10,20,15};
        int result=PeakElement( arr);
       if (result != -1) {
            System.out.println("Peak element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
