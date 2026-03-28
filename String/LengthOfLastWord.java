package String;

public class LengthOfLastWord {
    public int  lengthOfLastWord(String s){
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s=" fly me   to   the moon";
        LengthOfLastWord obj=new LengthOfLastWord();
        int result=obj.lengthOfLastWord( s);
        System.out.println("Result is:"+result);
    }
}
