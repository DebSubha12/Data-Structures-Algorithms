package stack;
    //Nearest Smaller To Right
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearestSmallerToRight {
    public static void nstr(int[] arr){
        int n=arr.length;
        ArrayList <Integer> a=new ArrayList<>();
        Stack <Integer> s=new Stack<>();

        for (int i = n - 1; i >= 0; i--){
            if(s.size()==0){
                a.add(-1);
            }
            else if(s.size()>0 && s.peek() < arr[i]){
                a.add(s.peek());
            }else if(s.size()>0 && s.peek()>=arr[i]){
                while (s.size()>0 && s.peek()>=arr[i]) {
                    s.pop();
                }
                if(s.size()==0){
                    a.add(-1);
                }else{
                    a.add(s.peek());
                }
            }
            s.add(arr[i]);
        }
         Collections.reverse(a);
        System.out.println(a);
        
    }
        public static void main(String[] args) {
            int [] arr={4,5,2,10,8};
            nstr(arr);
        }
    }

