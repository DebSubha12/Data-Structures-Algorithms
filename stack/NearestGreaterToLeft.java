package stack;
    //Nearest Greater To Left
import java.util.ArrayList;
import java.util.Stack;

public class NearestGreaterToLeft {
    public static void ngleft(int[] arr){
        int n=arr.length;

        //create ArrayList and Stack
        ArrayList <Integer> a=new ArrayList<>();
        Stack <Integer> s=new Stack<>();

        //Traverse the array
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                a.add(-1);
            }else if(!s.isEmpty() && s.peek() > arr[i]){
                a.add(s.peek());
            }else{
                while (!s.isEmpty() && s.peek()<=arr[i]) {
                    s.pop();
                }
                if(s.isEmpty()){
                    a.add(-1);
                }else{
                    a.add(s.peek());
                }
            }
            s.push(arr[i]);
        }
        System.out.println(a);
        
    }
    public static void main(String[] args) {
        int [] arr={1,3,2,4};
        ngleft(arr);
    }
}
