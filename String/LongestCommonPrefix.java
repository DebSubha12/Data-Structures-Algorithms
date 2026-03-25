package String;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st1=strs[0];
        String st2=strs[strs.length-1];
        int index=0;
        while(index<st1.length()){
            if(st1.charAt(index)==st2.charAt(index)){
                index++;
            }else{
                break;
            }
            
        }
        return index==0?"":st1.substring(0,index);
    }
    public static void main(String[] args) {
      String strs[]= {"flower","flow","flight"};
      System.out.println(longestCommonPrefix( strs));
    }
}
